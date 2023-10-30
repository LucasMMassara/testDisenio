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
import logica.IndicadorRiesgo;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Lucas
 */
public class IndicadorRiesgoJpaController implements Serializable {

    public IndicadorRiesgoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public IndicadorRiesgoJpaController(){
        emf = Persistence.createEntityManagerFactory("JPAPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(IndicadorRiesgo indicadorRiesgo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(indicadorRiesgo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(IndicadorRiesgo indicadorRiesgo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            indicadorRiesgo = em.merge(indicadorRiesgo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = indicadorRiesgo.getId();
                if (findIndicadorRiesgo(id) == null) {
                    throw new NonexistentEntityException("The indicadorRiesgo with id " + id + " no longer exists.");
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
            IndicadorRiesgo indicadorRiesgo;
            try {
                indicadorRiesgo = em.getReference(IndicadorRiesgo.class, id);
                indicadorRiesgo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The indicadorRiesgo with id " + id + " no longer exists.", enfe);
            }
            em.remove(indicadorRiesgo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<IndicadorRiesgo> findIndicadorRiesgoEntities() {
        return findIndicadorRiesgoEntities(true, -1, -1);
    }

    public List<IndicadorRiesgo> findIndicadorRiesgoEntities(int maxResults, int firstResult) {
        return findIndicadorRiesgoEntities(false, maxResults, firstResult);
    }

    private List<IndicadorRiesgo> findIndicadorRiesgoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(IndicadorRiesgo.class));
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

    public IndicadorRiesgo findIndicadorRiesgo(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(IndicadorRiesgo.class, id);
        } finally {
            em.close();
        }
    }

    public int getIndicadorRiesgoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<IndicadorRiesgo> rt = cq.from(IndicadorRiesgo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
