package Homework8.Excercise1;

public class Square implements Shape {

    @Override
    public double getArea(double d) {
        return (d * d);
    }

    @Override
    public double getPerimeter(double d) {
        return (4 * d);
    }
}
