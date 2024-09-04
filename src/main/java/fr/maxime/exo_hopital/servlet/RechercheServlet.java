package fr.maxime.exo_hopital.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "rechercheservlet", value = "/patient/*")
public class RechercheServlet  extends HttpServlet {
    public String titre;
    public void init(){
        titre = "recherche";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("titre", titre);
        req.getRequestDispatcher("/WEB-INF/recherche.jsp").forward(req, resp);
    }
}
