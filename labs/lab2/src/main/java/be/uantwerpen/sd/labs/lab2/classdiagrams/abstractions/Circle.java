package be.uantwerpen.sd.labs.lab2.classdiagrams.abstractions;

/*
TODO: Implement 'Circle' and its formulas for circumference and area.
Methods you will implement:
  - double calcCircumference()
  - double calcArea()
*/
public class Circle extends Shape {
    public Circle(double radius, String name) {
        super(radius, name);
    }
    @Override
    public double calcArea() {
        return Math.PI*size*size;
    }
    public double calcCircumference() {
        return Math.PI*size*2;
    }
}
