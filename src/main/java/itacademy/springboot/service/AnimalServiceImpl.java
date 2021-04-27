package itacademy.springboot.service;

import itacademy.springboot.entity.Animal;
import itacademy.springboot.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<Animal> getALl() {
        return animalRepository.findAll();
    }

    @Override
    public Animal save(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public Animal getById(Long id) {
        return animalRepository.findById(id).orElse(null);
    }

    @Override
    public Animal deleteById(Long id) {
        Animal animal = getById(id);
        if (animal != null){
            animalRepository.delete(animal);
            return animal;
        }
        return null;
    }


}
