package fr.maxime.exo_hopital.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "connectionservlet", value = "/connection/*")
public class ConnectionServlet  extends HttpServlet {
    private final String LOGIN_USER = "login";
    private final String PASSWORD_USER = "0000";

    public String titre;
    public void init(){
        titre = "connection";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/connection.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if (!login.equals(LOGIN_USER) && !password.equals(PASSWORD_USER)) {
            titre = "Elmer Fudd ?";
            req.getRequestDispatcher("/WEB-INF/connection.jsp").forward(req, resp);
        }
    }
}
