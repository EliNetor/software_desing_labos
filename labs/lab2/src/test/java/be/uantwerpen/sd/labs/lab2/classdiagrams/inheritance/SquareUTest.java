package be.uantwerpen.sd.labs.lab2.classdiagrams.inheritance;

import be.uantwerpen.sd.labs.lab2.classdiagrams.abstractions.Shape;
import be.uantwerpen.sd.labs.lab2.classdiagrams.abstractions.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareUTest {
    Shape square = new Square(10, "square");

    @Test
    void name() {
        assertEquals("square", square.getName());
    }

    @Test
    void calcArea() {
        assertEquals(100, square.calcArea());
    }

    @Test
    void calcCircumference() {
        assertEquals(40, square.calcCircumference());
    }
}
