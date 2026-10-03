package GPTPractiseSet.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpMain {
    public static void main(String[] args) {
        List<Employee> employeeList= Arrays.asList(
                new Employee(1,"Rohit",20000),
                new Employee(5,"Surya",100000),
                new Employee(3,"Bumrah",25000),
                new Employee(2,"Axar",15000)
        );

        employeeList.sort((a,b) -> Double.compare(b.getSalary(),a.getSalary()));

        employeeList.forEach(System.out::println);
    }
}
