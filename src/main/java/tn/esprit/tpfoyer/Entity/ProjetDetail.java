package tn.esprit.tpfoyer.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProjetDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetail;
    private String description;



    @OneToOne(mappedBy = "projetDetail")
    @ToString.Exclude
    @JsonIgnore
    private Projet projet;
}
