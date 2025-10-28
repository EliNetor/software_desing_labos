package be.uantwerpen.sd.labs.lab2.classdiagrams.inheritance;

/*
TODO: Implement CustomerService according to the UML Diagram.
Fields you will need:
  - double bonusPerCostumer
  - double numberOfCostumers
Methods you will implement:
  - double calculateDailySalary()
TIP: Start from your class diagram; add fields first, then implement the required methods. Don't forget to actually inherit from Employee.
*/
public class CustomerService extends Employee {
    protected double bonusPerCostumer;
    protected double numberOfCostumers;

    public CustomerService(double hourlySalary, double hoursWorked, double bonusPerCostumer, double numberOfCostumers) {
        super(hourlySalary,hoursWorked);
        this.bonusPerCostumer = bonusPerCostumer;
        this.numberOfCostumers = numberOfCostumers;
    }

    @Override
    public double calculateDailySalary() {
        return (hoursWorked * hourlySalary) + (bonusPerCostumer * numberOfCostumers);
    }
}
