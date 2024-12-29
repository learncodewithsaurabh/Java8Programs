package Java8Programs.Q67;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

public class FindHighestPaidEmployee_67 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Rahul Sharma", 175000),
            new Employee("Anita Verma", 82000),
            new Employee("Vikas Gupta", 56000),
            new Employee("Priya Singh", 90000)
        );
        // Find the highest-paid employee
      Employee highestPaidEmp =  employees.stream()
                                        .max(Comparator.comparingDouble(Employee::getSalary))
                                            .orElseThrow(()-> new RuntimeException("No employee found"));
        System.out.println("Highest Paid Employee = "+highestPaidEmp);
    }
}
