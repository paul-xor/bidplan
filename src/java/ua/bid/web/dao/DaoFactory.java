/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.bid.web.dao;

/**
 *
 * @author paul
 */
public class DaoFactory {
    
    private static final IDao DAO = new DaoImpl();
    
    private DaoFactory(){}
    
    public  static IDao getInstance(){
        return DAO;
    }
    
}
