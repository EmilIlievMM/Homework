package Homework8.BestOopExample.Interfaces;

public class Eagle implements Animal, Bird {
    @Override
    public void eat() {
        System.out.println("Eats reptiles");
    }

    @Override
    public void sound() {
        System.out.println("Whistling sound");
    }

    @Override
    public void fly() {
        System.out.println("Flies up to 10,000 feet.");
    }
}
