package fr.Nudgeoring.dataviz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tv")
public class TVController{

@Autowired 
    private TVRepository repo;

@GetMapping("/all")
public Iterable<TV> getall() {
return repo.findAll();

}
    @PostMapping("/add")
    public TV addTv(@RequestBody TV t) {
        return repo.save(t);
    }

    @GetMapping("/search")
    public List<TV> searchByMarque(@RequestParam String marque) {
        return repo.findByMarque(marque);
   }

@GetMapping("/debug")
public Iterable<TV> debugAll() {
    return repo.findAll();
}


}

