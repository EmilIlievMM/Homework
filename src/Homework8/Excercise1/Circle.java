package Homework8.Excercise1;

public class Circle implements Shape {
    @Override
    public double getArea(double d) {
        return (Math.PI * Math.pow(d, 2));
    }

    @Override
    public double getPerimeter(double d) {
        return (Math.PI * Math.pow(d, 2));
    }
}
