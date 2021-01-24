package Cats;

public class Main {
    public static void main(String[] args) {
        for (int age=0; age<10; age++){
        Cat myBarsik = new Cat();
        myBarsik.setName("Barsik"); // Set the value of the name variable to "John"
        myBarsik.setAge(age);
        myBarsik.setWeight(3);
        System.out.println("My name is " + myBarsik.getName() + " and I'm " + myBarsik.getAge() + " years old.");

    }
}}
