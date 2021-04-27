package itacademy.springboot.service;

import itacademy.springboot.entity.Animal;

import java.util.List;

public interface AnimalService {
    List<Animal> getALl();
    Animal save(Animal animal);
    Animal getById(Long id);
    Animal deleteById(Long id);
}
