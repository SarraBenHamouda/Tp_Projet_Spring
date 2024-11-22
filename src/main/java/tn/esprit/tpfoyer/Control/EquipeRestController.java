package tn.esprit.tpfoyer.Control;




import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entity.Equipe;
import tn.esprit.tpfoyer.Services.IEquipeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipe")
public class EquipeRestController {



    IEquipeService EquipeService;

    // http://localhost:8089/tpfoyer/universite/retrieve-all-universites
    @GetMapping("/retrieve-all-equipes")
    public List<Equipe> getEquipes() {
        return EquipeService.retrieveAllEquipes();
    }

    // http://localhost:8089/tpfoyer/universite/retrieve-universite/8
    @GetMapping("/retrieve-equipe/{equipe-id}")
    public Equipe retrieveEquipe(@PathVariable("equipe-id") Long idEquipe) {
        return EquipeService.retrieveEquipe(idEquipe);
    }

    // http://localhost:8089/tpfoyer/universite/add-universite
    @PostMapping("/add-equipe")
    public Equipe addEquipe(@RequestBody Equipe e) {
        return EquipeService.addEquipe(e);
    }

    // http://localhost:8089/tpfoyer/universite/remove-universite/8
    @DeleteMapping("/remove-equipe/{equipe-id}")
    public void removeEquipe(@PathVariable("equipe-id") Long idEquipe) {
        EquipeService.removeEquipe(idEquipe);
    }


    // http://localhost:8089/tpfoyer/universite/modify-universite
    @PutMapping("/modify-equipe")
    public Equipe modifyEquipe(@RequestBody Equipe e) {
        return EquipeService.modifyEquipe(e);


    }
}



