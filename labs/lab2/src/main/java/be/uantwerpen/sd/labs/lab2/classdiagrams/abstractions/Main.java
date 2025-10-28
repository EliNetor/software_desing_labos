package be.uantwerpen.sd.labs.lab2.classdiagrams.abstractions;

public class Main {

    public Main() {

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void run() {
        /*
            TODO: Create multiple instances of each different Shape and pass them (as Shape) to printShape(...) to verify polymorphism.
            TIP: Upcast to Shape and keep fields private/protected as appropriate.
        */

        Shape circle = new Circle(3, "circle");
        Shape triangle = new EquilateralTriangle(3, "triangle");
        Shape square = new Square(4, "square");

        printShape(circle);
        printShape(triangle);
        printShape(square);
    }

    public void printShape(Shape shape) {
        // TODO: Once Shape.calcCircumference and Shape.calcArea exists, print the Circumference and Area of each Shape.
        double area = shape.calcArea();
        double omtrek = shape.calcCircumference();
        if (area>= 0 && omtrek >= 0) {
            System.out.println("Name is " + shape.getName());
            System.out.println("Area is " + area);
            System.out.println("Circumference is " + omtrek);
        }
    }

}
