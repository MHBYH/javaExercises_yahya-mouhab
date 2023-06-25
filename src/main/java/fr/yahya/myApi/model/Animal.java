package fr.yahya.myApi.model;

public class Animal {
    // VARIABLES
    //##################################################//
    private int id;
    private String name;
    private String type;
    private int weight;
    //##################################################//
    
    // GETTER SETTER
    //##################################################//
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    //##################################################//
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //##################################################//
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    //##################################################//

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    //##################################################//

    // CONSTRUCTEUR
    //##################################################//
    public Animal(int id, String name, String type, int weight) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.weight = weight;
    }
    //##################################################//
    
}
