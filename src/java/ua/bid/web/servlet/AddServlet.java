/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.bid.web.servlet;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ua.bid.web.dao.DaoFactory;
import ua.bid.web.entity.Tickets;
import ua.bid.web.dao.IDao;


/**
 *
 * @author paul
 */
@WebServlet(name = "add", urlPatterns = {"/add"})
public class AddServlet extends HttpServlet {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bidplan3PU");

    private final IDao dao = DaoFactory.getInstance();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tid = request.getParameter("tid");
        String omid = request.getParameter("omid");
        String opportunity = request.getParameter("opportunity");
        String customer = request.getParameter("customer");
        String country = request.getParameter("country");
        String contact = request.getParameter("contact");
        String caseOwner = request.getParameter("caseOwner");
        
        String start = request.getParameter("start");
        String end = request.getParameter("end");
        String status = request.getParameter("status");
        dao.persist(new Tickets(tid, omid, opportunity,customer,country,contact,caseOwner,start,end,status));
        response.sendRedirect("view");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/pages/add-f.jsp").forward(request, responce);
    }

        
 
}
