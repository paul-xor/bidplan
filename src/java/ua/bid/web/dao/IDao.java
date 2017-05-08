/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.bid.web.dao;

import java.util.List;
import ua.bid.web.entity.Deliverables;
import ua.bid.web.entity.Tickets;

/**
 *
 * @author paul
 */
public interface IDao {
    
    List<Tickets> getAll();
    void persist(Tickets ticket);
    
    List<Deliverables> getByTid();
    void  selectByTid(String tid);
    
    void remove(int id);
}
