package org.example;

import org.example.Entities.Evento;
import org.example.Entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class Main 
{
        private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("test_jpa");
        private static EntityManager em = emf.createEntityManager();
    public static void main( String[] args ) {

        em.close();
        emf.close();
    }

    public static void save(Evento e){
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
    }
}
