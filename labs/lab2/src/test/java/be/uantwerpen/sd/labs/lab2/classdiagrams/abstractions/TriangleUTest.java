package be.uantwerpen.sd.labs.lab2.classdiagrams.abstractions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleUTest
{
    Shape triangle = new EquilateralTriangle(20, "triangle");

    @Test
    void name() {
        assertEquals("triangle", triangle.getName());
    }

    @Test
    void calcArea() {
        assertEquals((Math.sqrt(3)/4)*Math.pow(20, 2), triangle.calcArea());
    }

    @Test
    void calcCircumference() {
        assertEquals(60, triangle.calcCircumference());
    }
}
