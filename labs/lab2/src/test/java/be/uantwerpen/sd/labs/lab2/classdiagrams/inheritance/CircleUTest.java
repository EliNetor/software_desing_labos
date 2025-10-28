package be.uantwerpen.sd.labs.lab2.classdiagrams.inheritance;

import be.uantwerpen.sd.labs.lab2.classdiagrams.abstractions.Circle;
import be.uantwerpen.sd.labs.lab2.classdiagrams.abstractions.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleUTest {
    Shape circle = new Circle(2, "Circle");

    @Test
    void name() {
        assertEquals("Circle", circle.getName());
    }

    @Test
    void calcArea() {
        assertEquals(4*Math.PI, circle.calcArea());
    }

    @Test
    void calcCircumference() {
        assertEquals(Math.PI*4, circle.calcCircumference());
    }
}
