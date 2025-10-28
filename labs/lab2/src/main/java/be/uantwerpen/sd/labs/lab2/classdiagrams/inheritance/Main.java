package be.uantwerpen.sd.labs.lab2.classdiagrams.inheritance;

public class Main {
    public Main() {

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void run() {
        /*
            TODO: Create instances of each role and pass them (as Employee) to printWage(...) to verify polymorphism.
            TIP: Upcast to Employee and keep fields private/protected as appropriate.
        */

        Employee departmentOfficer = new DepartmentOfficer(12,8,1);
        Employee programmer = new Programmer(10, 8, 3, 7);
        Employee customerService = new CustomerService(8, 8, 0.25, 10);

        printWage("DO",departmentOfficer);
        printWage("PR",programmer);
        printWage("CS",customerService);
    }

    public void printWage(String name, Employee e) {
        /*
            TODO: Once Employee.calculateDailySalary exists, print the salary for each employee.
            TIP: Use: System.out.println(\"Employee \" + name + \": salary = \" + e.calculateDailySalary());
        */
        try{
            System.out.println("Employee " + name + ": daily salary = $" + e.calculateDailySalary());
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
