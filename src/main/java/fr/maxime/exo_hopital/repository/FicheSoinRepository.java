package fr.maxime.exo_hopital.repository;

import fr.maxime.exo_hopital.entity.FicheSoin;

public class FicheSoinRepository extends BaseRepository<FicheSoin> {
    public FicheSoinRepository() {
        super(FicheSoin.class);
    }
}
