package Homework8.BestOopExample.Interfaces;

interface Animal {

    void eat();
    void sound();


    default void label(){
        System.out.println("Animal's data");
    }
}
