package fr.yahya.myApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.yahya.myApi.model.Animal;
import fr.yahya.myApi.model.User;
import fr.yahya.myApi.service.AnimalService;

@RestController
public class AnimalController {
    private AnimalService animalService;
    public AnimalController(AnimalService animalService) {
    this.animalService = animalService;
    }

    @GetMapping("/animals")
    public Animal getUser(@RequestParam int id) { 
    Animal animal = animalService.getAnimal(id);
    return animal;
    }


    @PostMapping("/animals")
    public User createUser(@RequestBody UserRequest body) {
    String name = body.getName();
    int age = body.getAge();    
    return animalService.createAnimal(name, age);
    }

    @PutMapping("/animals") 
    public User updateUser(@RequestParam  int id, @RequestBody UserRequest body){
        return animalService.updateAnimal(id, body.getName(), body.getAge());

    }
    
}
