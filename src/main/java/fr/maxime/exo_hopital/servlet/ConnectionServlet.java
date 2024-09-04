package fr.maxime.exo_hopital.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "connectionservlet", value = "/connection/*")
public class ConnectionServlet  extends HttpServlet {
    private final String LOGIN_USER = "login";
    private final String PASSWORD_USER = "0000";

    public boolean isLogged = false;
    public String titre;
    public void init(){
        titre = "connection";
        isLogged = false;

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("titre",titre);
        req.getRequestDispatcher("/WEB-INF/connection.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if (!login.equals(LOGIN_USER) && !password.equals(PASSWORD_USER)) {
            isLogged = false;
            HttpSession session = req.getSession();
            session.setAttribute("pseudo", login);
            session.setAttribute("isLogged", isLogged);
            titre = "Elmer Fudd ?";
            doGet(req, resp);
        }else {
            titre = "quoi de neuf docteur ?";

            isLogged = true;
            HttpSession session = req.getSession();
            session.setAttribute("pseudo", login);
            session.setAttribute("isLogged", isLogged);
            doGet(req, resp);
        }
    }
}
