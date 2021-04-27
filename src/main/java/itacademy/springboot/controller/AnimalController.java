package itacademy.springboot.controller;

import itacademy.springboot.entity.Animal;
import itacademy.springboot.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping
    public List<Animal> getAll(){
        return animalService.getALl();
    }
    @PostMapping
    public Animal save (@RequestBody Animal animal){
        return animalService.save(animal);
    }
    @GetMapping("/{id}")
    public Animal getById(@PathVariable("id") Long id){
        return animalService.getById(id);
    }
    @DeleteMapping("/{id}")
    public Animal deleteById(@PathVariable Long id){
        return animalService.deleteById(id);
    }

}
