package tn.esprit.tpfoyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entity.Equipe;
import tn.esprit.tpfoyer.Repositories.EquipeRepository;
import java.util.List;


@Service
@AllArgsConstructor
public class EquipeImpService implements IEquipeService{
    EquipeRepository EquipeRepository;

    @Override
    public List<Equipe> retrieveAllEquipes() {
        return EquipeRepository.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return EquipeRepository.save(e);
    }

    @Override
    public Equipe modifyEquipe(Equipe e) {
        return EquipeRepository.save(e);
    }

    @Override
    public Equipe retrieveEquipe(Long idEquipe) {
        return EquipeRepository.findById(idEquipe).orElse(null);
    }

    @Override
    public void removeEquipe(Long idEquipe) {
        EquipeRepository.deleteById(idEquipe);
    }
}