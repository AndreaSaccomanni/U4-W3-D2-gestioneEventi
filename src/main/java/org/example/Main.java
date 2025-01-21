package org.example;

import org.example.DAO.EventoDAO;
import org.example.Entities.Evento;
import org.example.enumeration.TipoEvento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Main 
{
        //oggetto che contiene tutte le credenziali
        private static EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("GestioneEventi");
        //oggetto che sfrutterà le credenziali per comunicare con il database
        private static EntityManager em =
                emf.createEntityManager();

    public static void main( String[] args ) {
        EventoDAO eventoDao = new EventoDAO(em);
        Evento ev = new Evento("Lezione java", LocalDate.now(), "Corso java", TipoEvento.PUBBLICO, 200);
        Evento ev2 = new Evento("Lezione java2", LocalDate.now(), "Corso java", TipoEvento.PUBBLICO, 200);
        eventoDao.save(ev);
        eventoDao.save(ev2);
        Evento getEv = eventoDao.getById(1L);


        //eventoDao.delete(getEv);
    }



}
