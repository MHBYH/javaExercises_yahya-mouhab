package fr.yahya.myApi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.yahya.myApi.model.Animal;
import fr.yahya.myApi.service.AnimalService;

@RestController
public class AnimalController {
    private AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/animal")
    public ResponseEntity<Animal> getAnimal(@RequestParam int id) {
        Animal animal = animalService.getAnimal(id);
        return ResponseEntity.ok(animal);
    }

    @PostMapping("/animal")
    public ResponseEntity<Animal> createAnimal(@RequestBody AnimalRequest body) {
        String name = body.getName();
        int weight = body.getWeight();
        Animal createdAnimal = animalService.createAnimal(name, weight);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAnimal);
    }

    @PutMapping("/animal")
    public ResponseEntity<Animal> updateAnimal(@RequestParam int id, @RequestBody AnimalRequest body) {
        Animal updatedAnimal = animalService.updateAnimal(id, body.getName(), body.getWeight());
        return ResponseEntity.ok(updatedAnimal);
    }
}
