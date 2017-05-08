/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.bid.web.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import ua.bid.web.entity.Deliverables;
import ua.bid.web.entity.Tickets;


/**
 *
 * @author paul
 */
public class DaoImpl implements IDao{
    private final EntityManagerFactory factory;
    
    public DaoImpl(){
        this.factory = Persistence.createEntityManagerFactory("bidplan3PU");
    }
    
    private EntityManager getEntityManager(){
        return factory.createEntityManager();
    }

    @Override
    public List<Tickets> getAll() {
        List<Tickets> list = new ArrayList<>();
        EntityManager em = getEntityManager();
        try {
            list = em.createNamedQuery("Tickets.findAll", Tickets.class).getResultList();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return list;
    }
    
    
    @Override
    public List<Deliverables> getByTid()
    {
        List<Deliverables> list = new ArrayList<>();
        EntityManager em =  getEntityManager();
        try {
            list = em.createNamedQuery("Deiveables.findByTid", Deliverables.class).getResultList();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close(); 
        }
        return list;
                
    }
    
    
    @Override
    public void persist(Tickets ticket) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(ticket);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    /*
    @Override
    public void persist(Deliverables deliverable) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(deliverable);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    */
    @Override
    public void selectByTid(String tid) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.find(Deliverables.class, tid);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    @Override
    public void remove(int id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.find(Tickets.class, id));
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public DaoImpl(EntityManagerFactory factory) {
        this.factory = factory;
    } 
     
    
}
