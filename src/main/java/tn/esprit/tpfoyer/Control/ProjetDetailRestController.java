package tn.esprit.tpfoyer.Control;



import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entity.ProjetDetail;
import tn.esprit.tpfoyer.Services.IProjetDetailService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/projetdetail")
public class ProjetDetailRestController {


    IProjetDetailService ProjetDetailService;

    // http://localhost:8089/tpfoyer/projetdetail/retrieve-all-projetdetails
    @GetMapping("/retrieve-all-rprojetdetails")
    public List<ProjetDetail> getProjetDetails() {
        return ProjetDetailService.retrieveAllProjetDetails();
    }

    // http://localhost:8089/tpfoyer/reservation/retrieve-reservation/8
    @GetMapping("/retrieve-projetdetail/{projetdetail-id}")
    public ProjetDetail retrieveProjetDetail(@PathVariable("projetdetail-id") Long idProjetDetail) {
        return ProjetDetailService.retrieveProjetDetail(idProjetDetail);
    }

    // http://localhost:8089/tpfoyer/reservation/add-reservation
    @PostMapping("/add-projetdetail")
    public ProjetDetail addProjetDetail(@RequestBody ProjetDetail projetDetail) {
        return ProjetDetailService.addProjetDetail(projetDetail);
    }

    // http://localhost:8089/tpfoyer/reservation/remove-reservation/8
    @DeleteMapping("/remove-projetdetail/{projetdetail-id}")
    public void removeProjetDetail(@PathVariable("projetdetail-id") Long idProjetDetail) {
        ProjetDetailService.removeProjetDetail(idProjetDetail);
    }


    // http://localhost:8089/tpfoyer/reservation/modify-reservation
    @PutMapping("/modify-reservation")
    public ProjetDetail modifyProjetDetail(@RequestBody ProjetDetail projetDetail) {
        return ProjetDetailService.modifyProjetDetail(projetDetail);
    }
}

