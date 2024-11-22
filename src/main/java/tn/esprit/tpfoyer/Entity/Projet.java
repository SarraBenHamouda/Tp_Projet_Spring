package tn.esprit.tpfoyer.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProjet;
    private String sujet;

    @ManyToMany
    @JoinTable(
            name = "projet_equipe", // Name of the join table
            joinColumns = @JoinColumn(name = "projet_id"), // Foreign key column referring to Projet
            inverseJoinColumns = @JoinColumn(name = "equipe_id") // Foreign key column referring to Equipe
    )
    private Set<Equipe> equipes;

    @OneToOne( cascade = CascadeType.ALL)
    private ProjetDetail projetDetail;
}
