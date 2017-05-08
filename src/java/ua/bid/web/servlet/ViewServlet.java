/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.bid.web.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.bid.web.dao.DaoFactory;
import ua.bid.web.dao.IDao;
import ua.bid.web.entity.Tickets;

/**
 *
 * @author paul
 */
@WebServlet(name = "view", urlPatterns = {"/view"})
public class ViewServlet extends HttpServlet {

    private final IDao dao = DaoFactory.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Tickets> list = dao.getAll();
        request.setAttribute("tickets", list);
        request.getRequestDispatcher("WEB-INF/pages/view.jsp").forward(request, response);
    }

    
}
