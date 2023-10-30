/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.PorcentajeCobertura;
import persistencia.exceptions.NonexistentEntityException;
import persistencia.exceptions.PreexistingEntityException;

/**
 *
 * @author Lucas
 */
public class PorcentajeCoberturaJpaController implements Serializable {

    public PorcentajeCoberturaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public PorcentajeCoberturaJpaController(){
        emf = Persistence.createEntityManagerFactory("JPAPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(PorcentajeCobertura porcentajeCobertura) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(porcentajeCobertura);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPorcentajeCobertura(porcentajeCobertura.getId()) != null) {
                throw new PreexistingEntityException("PorcentajeCobertura " + porcentajeCobertura + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(PorcentajeCobertura porcentajeCobertura) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            porcentajeCobertura = em.merge(porcentajeCobertura);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = porcentajeCobertura.getId();
                if (findPorcentajeCobertura(id) == null) {
                    throw new NonexistentEntityException("The porcentajeCobertura with id " + id + " no longer exists.");
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
            PorcentajeCobertura porcentajeCobertura;
            try {
                porcentajeCobertura = em.getReference(PorcentajeCobertura.class, id);
                porcentajeCobertura.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The porcentajeCobertura with id " + id + " no longer exists.", enfe);
            }
            em.remove(porcentajeCobertura);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<PorcentajeCobertura> findPorcentajeCoberturaEntities() {
        return findPorcentajeCoberturaEntities(true, -1, -1);
    }

    public List<PorcentajeCobertura> findPorcentajeCoberturaEntities(int maxResults, int firstResult) {
        return findPorcentajeCoberturaEntities(false, maxResults, firstResult);
    }

    private List<PorcentajeCobertura> findPorcentajeCoberturaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PorcentajeCobertura.class));
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

    public PorcentajeCobertura findPorcentajeCobertura(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PorcentajeCobertura.class, id);
        } finally {
            em.close();
        }
    }

    public int getPorcentajeCoberturaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<PorcentajeCobertura> rt = cq.from(PorcentajeCobertura.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
