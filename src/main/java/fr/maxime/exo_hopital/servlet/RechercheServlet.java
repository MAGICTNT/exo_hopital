package fr.maxime.exo_hopital.servlet;

import fr.maxime.exo_hopital.entity.Patient;
import fr.maxime.exo_hopital.entity.StatusCode;
import fr.maxime.exo_hopital.repository.PatientRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "rechercheservlet", value = "/patient/*")
@MultipartConfig(maxFileSize = 1024 * 1024 * 10 )
public class RechercheServlet extends HttpServlet {
    public String titre;
    public Patient patient;
    public PatientRepository patientRepository;

    public void init() {
        this.titre = "recherche";
        this.patient = new Patient();
        patientRepository = new PatientRepository();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("titre", titre);
        req.setAttribute("patient", patient);
        req.getRequestDispatcher("/WEB-INF/recherche.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String cheminImg = "";
            try {
                String uploadPath = getServletContext().getRealPath("/") + "image";

                File file = new File(uploadPath);
                if (!file.exists()) {
                    file.mkdir();
                }
                System.out.println(req.getPart("image"));
                Part image = req.getPart("image");
                String fileName = image.getSubmittedFileName();
                image.write(uploadPath + File.separator + fileName);
                cheminImg = req.getContextPath() + "/image/" + fileName;
            } catch (Exception e) {
                System.out.println("image: " + e.getMessage());
            }
            patient.setNom(req.getParameter("nom"));
            patient.setNumeroTelephone(req.getParameter("telephone"));
            patient.setLienImage(cheminImg);
            patient.setDateNaissance(LocalDate.parse(req.getParameter("dateNaissance")));
            System.out.println(patient);
            patientRepository.createOrUpdate(patient);
            doGet(req, resp);
        } catch (Exception e) {
            doGet(req, resp);
            System.out.println(e.getMessage());
        }


    }
}
