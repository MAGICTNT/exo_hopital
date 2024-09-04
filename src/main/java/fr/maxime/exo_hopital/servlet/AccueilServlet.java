package fr.maxime.exo_hopital.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "accueilservlet", value = "")
public class AccueilServlet extends HttpServlet {
    public String titre;
    public void init(){
        titre = "Accueil du site";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("titre", titre);
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
