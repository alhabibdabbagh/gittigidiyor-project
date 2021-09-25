package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author habib
 * @on 16.08.2021 08:45
 */
public class EntityManagerUtils {

    static EntityManagerFactory emf = null;

    public static EntityManager getEntityManager(String persistenceUnitName){
        emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        return emf.createEntityManager();
    }

    public static void closeEntityManager(EntityManager em){
        em.clear();
        em.close();
        emf.close();
    }
}
