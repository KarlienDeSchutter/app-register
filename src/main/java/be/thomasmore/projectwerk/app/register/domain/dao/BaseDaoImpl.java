package be.thomasmore.projectwerk.app.register.domain.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

public abstract class BaseDaoImpl<E> {

    protected abstract EntityManager em();

    protected abstract Class<E> entityClass();

    public void save(E dataEntity) {
        em().persist(dataEntity);
    }

    public void delete(E e) {
        em().remove(e);
    }

    public void delete(String id) {
        em().remove(find(id));
    }

    public void deleteById(String id) {
        em().remove(find(id));
    }

    public E find(Object id) {
        return em().find(entityClass(), id);
    }
    
    public E findById(String id) {
        return em().find(entityClass(), id);
    }

    public List<E> listAll() {
        CriteriaQuery cq = em().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass()));
        Query q = em().createQuery(cq);
        return q.getResultList();
    }
}