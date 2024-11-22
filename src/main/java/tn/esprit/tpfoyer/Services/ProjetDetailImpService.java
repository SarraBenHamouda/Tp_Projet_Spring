package tn.esprit.tpfoyer.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entity.ProjetDetail;
import tn.esprit.tpfoyer.Repositories.ProjetDetailRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class ProjetDetailImpService implements IProjetDetailService {
    ProjetDetailRepository ProjetDetailRepository;

    @Override
    public List<ProjetDetail> retrieveProjetDetails() {
        return ProjetDetailRepository.findAll();
    }

    @Override
    public List<ProjetDetail> retrieveAllProjetDetails() {
        return null;
    }

    @Override
    public ProjetDetail addProjetDetail(ProjetDetail projetDetail) {
        return ProjetDetailRepository.save(projetDetail);
    }

    @Override
    public ProjetDetail modifyProjetDetail(ProjetDetail projetDetail) {
        return ProjetDetailRepository.save(projetDetail);
    }


    @Override
    public ProjetDetail retrieveProjetDetail(Long idProjetDetail) {
        return ProjetDetailRepository.findById(idProjetDetail).orElse(null);
    }

    @Override
    public void removeProjetDetail(Long idProjetDetail) {
        ProjetDetailRepository.deleteById(idProjetDetail);
    }
}