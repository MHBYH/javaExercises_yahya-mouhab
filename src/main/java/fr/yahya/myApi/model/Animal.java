/* 
- Un « id » de type « int ».
- Un « name » de type « String » pour définir son nom.
- Un « type » de type « String » pour définir le type d’animal.
- Un « weight » de type « int » pour définir le poids de l’animal.
 */
package fr.yahya.myApi.model;

public class Animal {
    private int id;
    public int getId() {
        return id;
    }
    // ##################################
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // ##################################
    private String type;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    // ##################################
    private int weight; // l'age est remplacer par le poids (weight)
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    // ##################################
    public Animal(int id, String name, String type, int weight) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.weight = weight;
    }
    public void add(Animal animal) {
    }
}