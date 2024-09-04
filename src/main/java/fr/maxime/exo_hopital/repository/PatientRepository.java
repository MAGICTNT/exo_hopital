package fr.maxime.exo_hopital.repository;

import fr.maxime.exo_hopital.entity.Patient;

public class PatientRepository extends BaseRepository<Patient> {
    public PatientRepository() {
        super(Patient.class);
    }
}
