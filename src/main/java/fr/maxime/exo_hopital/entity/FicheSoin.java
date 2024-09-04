package fr.maxime.exo_hopital.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "fiche_soins")
public class FicheSoin {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fiche_soins_id_gen")
    @SequenceGenerator(name = "fiche_soins_id_gen", sequenceName = "fiche_soins_id_fiche_soins_seq", allocationSize = 1)
    @Column(name = "id_fiche_soins", nullable = false)
    private Integer id;

    @Column(name = "text_fiche_soins", nullable = false)
    private String textFicheSoins;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_patient", nullable = false)
    private Patient idPatient;

}