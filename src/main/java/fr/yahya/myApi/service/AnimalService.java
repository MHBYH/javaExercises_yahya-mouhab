package fr.yahya.myApi.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.yahya.myApi.model.Animal;

@Service
public class AnimalService {
    private ArrayList<Animal> animals;

    public AnimalService() {
        this.animals = new ArrayList<Animal>();

        this.animals.add(new Animal(0, "CHIEN", "mamiferes", 20 ));
        this.animals.add(new Animal(1, "POISSON", "poisson", 5 ));
        this.animals.add(new Animal(2, "OISEAU", "oiseau", 3 ));
    }

    public Animal getAnimal(int id) {
        for (Animal animal : this.animals) {
            if (animal.getId() == id) {
                return animal;
            }
        }
        return null;
    }
        public Animal createAnimal(int id, String name, String type, int weight) {
        id = this.animals.size() + 1;
        Animal user = new Animal(id, name, type, weight);
        this.animals.add(user);
        return user;
    }
    public Animal updateUser(int id, String name, String type, int weight) {
    for (Animal animal : animals) {
        if (animal.getId() == id) {
            animal.setName(name);
            animal.setWeight(weight);
            return animal;
        }
    }
    return null; }

    public Animal updateAnimal(int id, String name, int age) {
        return null;
    }

    public Animal createAnimal(String name, int weight) {
        return null;
    }
}
