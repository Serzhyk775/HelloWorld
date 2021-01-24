package Cats;

public class Cat {
    private String name; // private = restricted access
    private int age;
    private int weight;

    // Getter for the name
    public String getName() {
        return name;
    }

    // Setter for the name
    public void setName(String newName) {
        this.name = newName;
    }

    // Getter for the age
    public int getAge() {
        return age;
    }

    // Setter for the age
    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
