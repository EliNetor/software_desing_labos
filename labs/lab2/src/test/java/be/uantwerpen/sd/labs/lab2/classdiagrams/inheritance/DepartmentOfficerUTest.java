package be.uantwerpen.sd.labs.lab2.classdiagrams.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepartmentOfficerUTest {
    Employee departmentOfficer = new DepartmentOfficer(8,12,9);

    @Test
    public void checkCalculatedSalary(){
        assertEquals(105, departmentOfficer.calculateDailySalary());
    }
}
