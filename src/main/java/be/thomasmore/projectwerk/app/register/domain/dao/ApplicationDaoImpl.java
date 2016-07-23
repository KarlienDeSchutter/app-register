package be.thomasmore.projectwerk.app.register.domain.dao;

import be.thomasmore.projectwerk.app.register.domain.entities.ApplicationEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ApplicationDaoImpl extends BaseDaoImpl<ApplicationEntity>implements ApplicationDao {

    @PersistenceContext(unitName = "appregPU")
    protected EntityManager em;

    @Override
    protected EntityManager em() {
        return em;
    }
    
    

    @Override
    protected Class<ApplicationEntity> entityClass() {
        return ApplicationEntity.class;
    }

    
}
