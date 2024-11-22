package tn.esprit.tpfoyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.Entity.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}