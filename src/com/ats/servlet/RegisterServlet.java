package com.ats.servlet;

import com.ats.dao.UserDAO;
import com.ats.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        User user = new User(name, email, password);
        UserDAO dao = new UserDAO();

        boolean success = dao.registerUser(user);

        if (success) {
            resp.sendRedirect("login.jsp");
        } else {
            resp.sendRedirect("register.jsp?error=true");
        }
    }
}
