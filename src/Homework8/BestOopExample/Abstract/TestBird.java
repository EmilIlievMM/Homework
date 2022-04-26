package Homework8.BestOopExample.Abstract;

public class TestBird {
    public static void main(String[] args) {
        Animal myBird = new Bird();
        myBird.label();
        myBird.move();
        myBird.eat();
    }
}
