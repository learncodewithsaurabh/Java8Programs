package Java8Programs.Q69;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String empName;
    private String departmentName;
    private double salary;

    public Employee(String empName, String departmentName, double salary) {
        this.empName = empName;
        this.departmentName = departmentName;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "empName='" + empName + '\'' +
            ", departmentName='" + departmentName + '\'' +
            ", salary=" + salary +
            '}';
    }
}

public class Top3HighestPaidEmployeesByDept_69 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Saurabh", "IT", 120000),
            new Employee("Shubham", "IT", 150000),
            new Employee("Pooja", "HR", 80000),
            new Employee("David", "IT", 200000),
            new Employee("Gaurav", "IT", 250000),
            new Employee("Soni", "Finance", 95000)
        );
        // Find the Top 3 Highest-Paid Employees in IT Department
        List<Employee> top3HighestPaidEmployees = employees.stream()
                                                            .filter(e->"IT".equals(e.getDepartmentName()))
                                                            .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                                                            .limit(3)
                                                            .collect(Collectors.toList());
        top3HighestPaidEmployees.forEach(System.out::println);
    }
}

