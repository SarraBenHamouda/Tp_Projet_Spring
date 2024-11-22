package tn.esprit.tpfoyer.Services;

import tn.esprit.tpfoyer.Entity.Equipe;

import java.util.List;

public interface IEquipeService {
    List<Equipe> retrieveAllEquipes();
    Equipe addEquipe(Equipe e);
    Equipe modifyEquipe(Equipe e);
    Equipe retrieveEquipe(Long idEquipe);
    void removeEquipe(Long idEquipe);
}