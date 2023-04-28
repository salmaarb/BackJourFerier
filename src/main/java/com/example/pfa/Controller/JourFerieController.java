package com.example.pfa.Controller;

import com.example.pfa.beans.JourFerie;
import com.example.pfa.repository.JourFerieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
@CrossOrigin({"http://localhost:9002/validation","http://localhost:3000","http://localhost:8081"})


@RestController
@RequestMapping("/jour")
public class JourFerieController {
    @Autowired
    private JourFerieRepo jourRepository;
    //@CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/save")
    public String save(@RequestBody JourFerie jour){
        jourRepository.save(jour);
        return "Bien Ajouteeee";
    }
  //  @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/all")
    public List<JourFerie> findAll(){
        return jourRepository.findAll();
    }
    @GetMapping("/debut")
    public List<LocalDate> getDate(){
        return jourRepository.getDateDebut();
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable(required = true) Integer id){
       jourRepository.deleteById(id);
       return "cc c'est supprimmeeeeeeee:)))";
    }
    @PutMapping("/update/{id}")
    public JourFerie update(@PathVariable (required = true) int id,@RequestBody JourFerie jouuur){
        jouuur.setId(id);
        return   jourRepository.save(jouuur);

    }
}
