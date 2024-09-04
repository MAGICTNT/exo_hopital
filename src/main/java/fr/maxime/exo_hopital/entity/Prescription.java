package fr.maxime.exo_hopital.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "prescription")
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prescription_id_gen")
    @SequenceGenerator(name = "prescription_id_gen", sequenceName = "prescription_id_prescription_seq", allocationSize = 1)
    @Column(name = "id_prescription", nullable = false)
    private Integer id;

    @Column(name = "text_prescription", nullable = false)
    private String textPrescription;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_patient", nullable = false)
    private Patient idPatient;

}