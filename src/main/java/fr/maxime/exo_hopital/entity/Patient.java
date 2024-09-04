package fr.maxime.exo_hopital.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_id_gen")
    @SequenceGenerator(name = "patient_id_gen", sequenceName = "patient_id_patient_seq", allocationSize = 1)
    @Column(name = "id_patient", nullable = false)
    private Integer id;

    @Column(name = "nom", nullable = false, length = 50)
    private String nom;

    @Column(name = "numero_telephone", nullable = false, length = 50)
    private String numeroTelephone;

    @Column(name = "lien_image", nullable = false)
    private String lienImage;

    @Column(name = "date_naissance", nullable = false)
    private LocalDate dateNaissance;

    @Column(name = "nom__medecin", length = 50)
    private String nomMedecin;

}