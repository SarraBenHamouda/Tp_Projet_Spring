package tn.esprit.tpfoyer.Services;


import tn.esprit.tpfoyer.Entity.ProjetDetail;

import java.util.List;

public interface IProjetDetailService {
    List<ProjetDetail> retrieveProjetDetails();

    List<ProjetDetail> retrieveAllProjetDetails();
    ProjetDetail addProjetDetail(ProjetDetail projetDetail);
    ProjetDetail modifyProjetDetail(ProjetDetail projetDetail);
    ProjetDetail retrieveProjetDetail(Long idProjetDetail);
    void removeProjetDetail(Long idProjetDetail);
}