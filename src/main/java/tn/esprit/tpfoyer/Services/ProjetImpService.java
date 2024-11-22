package tn.esprit.tpfoyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entity.Equipe;
import tn.esprit.tpfoyer.Entity.Projet;
import tn.esprit.tpfoyer.Entity.ProjetDetail;
import tn.esprit.tpfoyer.Repositories.EquipeRepository;
import tn.esprit.tpfoyer.Repositories.ProjetRepository;
import tn.esprit.tpfoyer.Repositories.ProjetDetailRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class ProjetImpService implements IProjetService{
    ProjetRepository projetRepository;
    ProjetDetailRepository projetDetailRepository;
    EquipeRepository EquipeRepository;
    @Override
    public List<Projet> retrieveAllProjets() {
        return projetRepository.findAll();
    }

    @Override
    public Projet addProjet(Projet p) {
        return projetRepository.save(p);
    }

    @Override
    public Projet modifyProjet(Projet p) {
        return projetRepository.save(p);
    }

    @Override
    public Projet retrieveProjet(Long idProjet) {
        return projetRepository.findById(idProjet).orElse(null);
    }

    @Override
    public void removeProjet(Long idProjet) {
        projetRepository.deleteById(idProjet);
    }

    public void assignProjetDetailToProjet(Long idProjet, Long idDetail) {
        Projet projet = projetRepository.findById(idProjet).get();
        ProjetDetail projetDetail= projetDetailRepository.findById(idDetail).get();
// on set le fils dans le parent :
        projet.setProjetDetail(projetDetail);
        projetRepository.save(projet);
    }

    public void assignProjetToEquipe(Long idProjet, Long idEquipe) {
        Projet projet = projetRepository.findById(idProjet).get();
        Equipe equipe = EquipeRepository.findById(idEquipe).get();
// on set le fils dans le parent :
        equipe.getProjet().add(projet);
        EquipeRepository.save(equipe);
    }

    public Projet addProjetAndAssignProjetToProjetDetail(Projet projet, Long IdDetail) {
        ProjetDetail projetDetail = projetDetailRepository.findById(IdDetail).get();
// on set le fils dans le parent :
        projet.setProjetDetail(projetDetail);
        return projetRepository.save(projet);
    }

    public Projet DesaffecterProjetDetailFromProjet(Long idProjet) {
        Projet projet = projetRepository.findById(idProjet).get();
        projet.setProjetDetail(null);
        return projetRepository.save(projet);
    }

}