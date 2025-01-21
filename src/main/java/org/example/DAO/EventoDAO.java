package org.example.DAO;

import org.example.Entities.Evento;

import javax.persistence.EntityManager;

public class EventoDAO {
     private static EntityManager em;

    public EventoDAO(EntityManager em) {
        this.em = em;
    }

    public static void save(Evento e){
        //apro connessione con database
        em.getTransaction().begin();
        //gli dico di salvare un determinato oggetto
        em.persist(e);
        em.getTransaction().commit();
    }

    //cercare un evento tramite id
    public  Evento getById(Long id){
        return em.find(Evento.class, id);
    }

    public void delete(Evento e){
        //apro connessione con database
        em.getTransaction().begin();
        //gli dico di rimuovere un determinato oggetto
        em.remove(e);
        em.getTransaction().commit();
    }
}
