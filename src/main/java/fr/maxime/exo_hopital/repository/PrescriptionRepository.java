package fr.maxime.exo_hopital.repository;

import fr.maxime.exo_hopital.entity.Prescription;

public class PrescriptionRepository extends BaseRepository<Prescription> {
    public PrescriptionRepository() {
        super(Prescription.class);
    }
}
