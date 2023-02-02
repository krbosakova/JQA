package Homework5;

public class Employee extends Person {
    double daySalary;
    double overtime;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.isMan = isMan;
        this.daySalary = daySalary;

    }

    public double calculateOvertime(double hours) {
        if (age < 18) {
            overtime = 0;
        } else {
            overtime = (daySalary / 8) * 1.5 * hours;
        }
        return overtime;
    }

    public String showEmployeeInfo() {
        return "Employee{" +
                "daySalary=" + daySalary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMan=" + isMan +
                '}';
    }
}
