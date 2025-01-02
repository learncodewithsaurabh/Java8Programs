package Java8Programs.Q68;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private String empName;
    private String departmentName;
    private double salary;

    // Constructor
    public Employee(String empName, String departmentName, double salary) {
        this.empName = empName;
        this.departmentName = departmentName;
        this.salary = salary;
    }

    // Getters
    public String getEmpName() {
        return empName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public double getSalary() {
        return salary;
    }
}

public class FindTotalSalaryByDepartment_68 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Rajesh Kumar", "IT", 60000),
            new Employee("Priya Sharma", "HR", 55000),
            new Employee("Ankit Singh", "IT", 65000),
            new Employee("Neha Gupta", "Finance", 70000),
            new Employee("Vikas Yadav", "HR", 45000)
        );

        // Find/Calculate total salary by department using Java 8 Stream API.
        Map<String,Double> totalSalaryByDepartment = employees.stream()
                                                .collect(
                                                           Collectors.groupingBy(Employee::getDepartmentName,
                                                           Collectors.summingDouble(Employee::getSalary))
                                                         );
        totalSalaryByDepartment.forEach((dept,salary)->System.out.println(dept+" : "+salary));
    }
}
