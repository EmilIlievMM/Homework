package Homework8.BestOopExample.Abstract;

public class Fish extends Animal {
    @Override
    void move() {
        System.out.println("Moves by swimming");
    }

    @Override
    void eat() {
        System.out.println("Eats seafood.");
    }
}
