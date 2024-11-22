package tn.esprit.tpfoyer.Control;

import lombok.AllArgsConstructor;
import org.springframework.core.env.PropertyResolverExtensionsKt;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entity.Projet;
import tn.esprit.tpfoyer.Services.IProjetService;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/projet")
public class ProjetRestController {

    IProjetService ProjetService;

    // http://localhost:8089/tpfoyer/bloc/retrieve-all-blocs
    @GetMapping("/retrieve-all-projets")
    public List<Projet> getProjets() {
        return ProjetService.retrieveAllProjets();
    }

    // http://localhost:8089/tpfoyer/bloc/retrieve-bloc/8
    @GetMapping("/retrieve-projet/{projet-id}")
    public Projet retrieveProjet(@PathVariable("projet-id") Long idBloc) {
        return ProjetService.retrieveProjet(idBloc);
    }
    @PutMapping("/affecter-equipe/{projet-id}/{equipe-id}")
    public void assignProjetToEquipe(@PathVariable("projet-id") Long idProjet,
                                           @PathVariable("equipe-id") Long idEquipe) {
        ProjetService.assignProjetDetailToProjet(idProjet, idEquipe);
    }

    // http://localhost:8089/tpfoyer/bloc/add-bloc
    @PostMapping("/add-projet")
    public Projet addProjet(@RequestBody Projet b) {
        return ProjetService.addProjet(b);
    }

    // http://localhost:8089/tpfoyer/bloc/remove-bloc/8
    @DeleteMapping("/remove-projet/{projet-id}")
    public void removeProjet(@PathVariable("projet-id") Long idProjet) {
        ProjetService.removeProjet(idProjet);
    }


    // http://localhost:8089/tpfoyer/bloc/modify-bloc
    @PutMapping("/modify-projet")
    public Projet modifyProjet(@RequestBody Projet p) {
        return ProjetService.modifyProjet(p);
    }

    @PutMapping("/affecter-projet/{projet-id}/{projet_detail_id_detail}")
    public void assignProjetDetailToProjet(@PathVariable("projet-id") Long idProjet,
                                           @PathVariable("projet_detail_id_detail") Long idDetail) {
        ProjetService.assignProjetDetailToProjet(idProjet,idDetail);
    }

    @PutMapping("/ajouter-projet-affecter-projet/{projet-id}/{projet_detail_id_detail}")
    public void addProjetAndAssignProjetToProjetDetail (
            @RequestBody Projet projet , @PathVariable("projet_detail_id_detail") Long IdDetail) {
        ProjetService.addProjetAndAssignProjetToProjetDetail(projet,IdDetail);
    }

    @PutMapping("/desafecter-projet-affecter-projet/{projet-id}")
    public void DesaffecterProjetDetailFromProjet (
            @PathVariable("projet-id" )Long IdProjet )
            {
        ProjetService.DesaffecterProjetDetailFromProjet(IdProjet);
    }




}