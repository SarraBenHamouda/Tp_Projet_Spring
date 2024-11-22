package tn.esprit.tpfoyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.Entity.ProjetDetail;

@Repository
public interface ProjetDetailRepository extends JpaRepository<ProjetDetail, Long> {
}