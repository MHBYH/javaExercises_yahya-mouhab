package fr.yahya.myApi.controller;

public class AnimalRequest {
    private String name;
    private int weight;
    public AnimalRequest(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
        public int getWeight() {
        return weight;
    }
}
