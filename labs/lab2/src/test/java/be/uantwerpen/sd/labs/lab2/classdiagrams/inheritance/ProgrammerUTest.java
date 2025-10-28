package be.uantwerpen.sd.labs.lab2.classdiagrams.inheritance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProgrammerUTest {
    Employee programmer = new Programmer(8,12,9,5);

    @Test
    public void checkCalculatedSalary(){
        assertEquals(141, programmer.calculateDailySalary());
    }
}
