package tn.esprit.tpfoyer.Services;

import tn.esprit.tpfoyer.Entity.Projet;

import java.util.List;

public interface IProjetService {
    List<Projet> retrieveAllProjets();
    Projet addProjet(Projet p);
    Projet modifyProjet(Projet p);


    Projet retrieveProjet(Long idProjet);
    void removeProjet(Long idProjet);

    void assignProjetDetailToProjet(Long idProjet, Long idDetail) ;

    void assignProjetToEquipe(Long idProjet, Long idEquipe);

    Projet addProjetAndAssignProjetToProjetDetail (Projet projet, Long IdDetail);

    Projet DesaffecterProjetDetailFromProjet(Long idProjet);
}

