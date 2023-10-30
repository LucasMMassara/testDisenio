/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.PorcentajeCobertura;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logica.Cobertura;
import persistencia.exceptions.IllegalOrphanException;
import persistencia.exceptions.NonexistentEntityException;
import persistencia.exceptions.PreexistingEntityException;

/**
 *
 * @author Lucas
 */
public class CoberturaJpaController implements Serializable {

    public CoberturaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public CoberturaJpaController(){
        emf = Persistence.createEntityManagerFactory("JPAPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cobertura cobertura) throws IllegalOrphanException, PreexistingEntityException, Exception {
        if (cobertura.getHistorial() == null) {
            cobertura.setHistorial(new HashSet<PorcentajeCobertura>());
        }
        List<String> illegalOrphanMessages = null;
        PorcentajeCobertura porcentajeActualOrphanCheck = cobertura.getPorcentajeActual();
        if (porcentajeActualOrphanCheck != null) {
            Cobertura oldCoberturaOfPorcentajeActual = porcentajeActualOrphanCheck.getCobertura();
            if (oldCoberturaOfPorcentajeActual != null) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("The PorcentajeCobertura " + porcentajeActualOrphanCheck + " already has an item of type Cobertura whose porcentajeActual column cannot be null. Please make another selection for the porcentajeActual field.");
            }
        }
        if (illegalOrphanMessages != null) {
            throw new IllegalOrphanException(illegalOrphanMessages);
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            PorcentajeCobertura porcentajeActual = cobertura.getPorcentajeActual();
            if (porcentajeActual != null) {
                porcentajeActual = em.getReference(porcentajeActual.getClass(), porcentajeActual.getId());
                cobertura.setPorcentajeActual(porcentajeActual);
            }
            Set<PorcentajeCobertura> attachedHistorial = new HashSet<PorcentajeCobertura>();
            for (PorcentajeCobertura historialPorcentajeCoberturaToAttach : cobertura.getHistorial()) {
                historialPorcentajeCoberturaToAttach = em.getReference(historialPorcentajeCoberturaToAttach.getClass(), historialPorcentajeCoberturaToAttach.getId());
                attachedHistorial.add(historialPorcentajeCoberturaToAttach);
            }
            cobertura.setHistorial(attachedHistorial);
            em.persist(cobertura);
            if (porcentajeActual != null) {
                porcentajeActual.setCobertura(cobertura);
                porcentajeActual = em.merge(porcentajeActual);
            }
            for (PorcentajeCobertura historialPorcentajeCobertura : cobertura.getHistorial()) {
                Cobertura oldCoberturaOfHistorialPorcentajeCobertura = historialPorcentajeCobertura.getCobertura();
                historialPorcentajeCobertura.setCobertura(cobertura);
                historialPorcentajeCobertura = em.merge(historialPorcentajeCobertura);
                if (oldCoberturaOfHistorialPorcentajeCobertura != null) {
                    oldCoberturaOfHistorialPorcentajeCobertura.getHistorial().remove(historialPorcentajeCobertura);
                    oldCoberturaOfHistorialPorcentajeCobertura = em.merge(oldCoberturaOfHistorialPorcentajeCobertura);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCobertura(cobertura.getDetalle()) != null) {
                throw new PreexistingEntityException("Cobertura " + cobertura + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cobertura cobertura) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cobertura persistentCobertura = em.find(Cobertura.class, cobertura.getDetalle());
            PorcentajeCobertura porcentajeActualOld = persistentCobertura.getPorcentajeActual();
            PorcentajeCobertura porcentajeActualNew = cobertura.getPorcentajeActual();
            Set<PorcentajeCobertura> historialOld = persistentCobertura.getHistorial();
            Set<PorcentajeCobertura> historialNew = cobertura.getHistorial();
            List<String> illegalOrphanMessages = null;
            if (porcentajeActualNew != null && !porcentajeActualNew.equals(porcentajeActualOld)) {
                Cobertura oldCoberturaOfPorcentajeActual = porcentajeActualNew.getCobertura();
                if (oldCoberturaOfPorcentajeActual != null) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("The PorcentajeCobertura " + porcentajeActualNew + " already has an item of type Cobertura whose porcentajeActual column cannot be null. Please make another selection for the porcentajeActual field.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (porcentajeActualNew != null) {
                porcentajeActualNew = em.getReference(porcentajeActualNew.getClass(), porcentajeActualNew.getId());
                cobertura.setPorcentajeActual(porcentajeActualNew);
            }
            Set<PorcentajeCobertura> attachedHistorialNew = new HashSet<PorcentajeCobertura>();
            for (PorcentajeCobertura historialNewPorcentajeCoberturaToAttach : historialNew) {
                historialNewPorcentajeCoberturaToAttach = em.getReference(historialNewPorcentajeCoberturaToAttach.getClass(), historialNewPorcentajeCoberturaToAttach.getId());
                attachedHistorialNew.add(historialNewPorcentajeCoberturaToAttach);
            }
            historialNew = attachedHistorialNew;
            cobertura.setHistorial(historialNew);
            cobertura = em.merge(cobertura);
            if (porcentajeActualOld != null && !porcentajeActualOld.equals(porcentajeActualNew)) {
                porcentajeActualOld.setCobertura(null);
                porcentajeActualOld = em.merge(porcentajeActualOld);
            }
            if (porcentajeActualNew != null && !porcentajeActualNew.equals(porcentajeActualOld)) {
                porcentajeActualNew.setCobertura(cobertura);
                porcentajeActualNew = em.merge(porcentajeActualNew);
            }
            for (PorcentajeCobertura historialOldPorcentajeCobertura : historialOld) {
                if (!historialNew.contains(historialOldPorcentajeCobertura)) {
                    historialOldPorcentajeCobertura.setCobertura(null);
                    historialOldPorcentajeCobertura = em.merge(historialOldPorcentajeCobertura);
                }
            }
            for (PorcentajeCobertura historialNewPorcentajeCobertura : historialNew) {
                if (!historialOld.contains(historialNewPorcentajeCobertura)) {
                    Cobertura oldCoberturaOfHistorialNewPorcentajeCobertura = historialNewPorcentajeCobertura.getCobertura();
                    historialNewPorcentajeCobertura.setCobertura(cobertura);
                    historialNewPorcentajeCobertura = em.merge(historialNewPorcentajeCobertura);
                    if (oldCoberturaOfHistorialNewPorcentajeCobertura != null && !oldCoberturaOfHistorialNewPorcentajeCobertura.equals(cobertura)) {
                        oldCoberturaOfHistorialNewPorcentajeCobertura.getHistorial().remove(historialNewPorcentajeCobertura);
                        oldCoberturaOfHistorialNewPorcentajeCobertura = em.merge(oldCoberturaOfHistorialNewPorcentajeCobertura);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = cobertura.getDetalle();
                if (findCobertura(id) == null) {
                    throw new NonexistentEntityException("The cobertura with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cobertura cobertura;
            try {
                cobertura = em.getReference(Cobertura.class, id);
                cobertura.getDetalle();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cobertura with id " + id + " no longer exists.", enfe);
            }
            PorcentajeCobertura porcentajeActual = cobertura.getPorcentajeActual();
            if (porcentajeActual != null) {
                porcentajeActual.setCobertura(null);
                porcentajeActual = em.merge(porcentajeActual);
            }
            Set<PorcentajeCobertura> historial = cobertura.getHistorial();
            for (PorcentajeCobertura historialPorcentajeCobertura : historial) {
                historialPorcentajeCobertura.setCobertura(null);
                historialPorcentajeCobertura = em.merge(historialPorcentajeCobertura);
            }
            em.remove(cobertura);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cobertura> findCoberturaEntities() {
        return findCoberturaEntities(true, -1, -1);
    }

    public List<Cobertura> findCoberturaEntities(int maxResults, int firstResult) {
        return findCoberturaEntities(false, maxResults, firstResult);
    }

    private List<Cobertura> findCoberturaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cobertura.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Cobertura findCobertura(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cobertura.class, id);
        } finally {
            em.close();
        }
    }

    public int getCoberturaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cobertura> rt = cq.from(Cobertura.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
