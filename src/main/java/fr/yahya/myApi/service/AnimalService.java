package fr.yahya.myApi.service;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import fr.yahya.myApi.model.Animal;
import fr.yahya.myApi.model.User;

@Service
public class AnimalService {
    private ArrayList<Animal> animals;

    public AnimalService() {
        this.animals = new ArrayList<Animal>();

        this.animals.add(new Animal(0, "CHIEN", "mammifères", 10));
        this.animals.add(new Animal(1, "POISSONS", "poissons", 2));
        this.animals.add(new Animal(2, "TORTUE", "reptiles", 3));
        this.animals.add(new Animal(2, "OISEAU", "oiseaux", 5));


    }
    public Animal getAnimal(int id) {
        for (Animal animal : this.animals) {
            if (animal.getId() == id) {
                return animal;
            }
        }
        return null;
    }

    public Animal createUser(int id, String name, String type, int weight) {

        Animal animal = new Animal(id, name, type, weight);
        this.animals.add(animal);
        return animal;
    }
    /**
     * @param id
     * @param name
     * @param age
     * @param object
     * @return
     */
    public Animal updateUser(int id, String name, String type, int weight) {
    for (Animal animal : animals) {
        if (animal.getId() == id) {
            animal.setName(name);
            animal.setWeight(weight);
            return animal;
        }
    }
    return null; }
    public User createAnimal(String name, int age) {
        return null;
    }
    public User updateAnimal(int id, String name, int age) {
        return null;
    }
}
