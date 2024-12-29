package Java8Programs.Q66;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Q66. How to  Find Employees By Department using the Java 8 Streams API?
class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "name='" + name + '\'' +
            ", department='" + department + '\'' +
            '}';
    }
}

public class FindEmployeeByDepartment_66 {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
            new Employee("Saurabh", "IT"),
            new Employee("Shubham", "HR"),
            new Employee("Sony", "IT"),
            new Employee("Rahul", "HR")
        );
        List<Employee> itEmployee =  employeeList.stream()
                                                     .filter(e-> "HR".equals(e.getDepartment()))
                                                         .collect(Collectors.toList());
        itEmployee.forEach(System.out::println);
    }
}
