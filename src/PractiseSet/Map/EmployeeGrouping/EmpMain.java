package PractiseSet.Map.EmployeeGrouping;

import java.util.*;

public class EmpMain {
    public static Map<String, Double> getDepartmentSalary(List<Employee> employees){
        Map<String,Double> ans=new HashMap<>();
        for(Employee it:employees){
            String dept=it.getDepartment();
            Double salary=it.getSalary();
            Double agg=ans.getOrDefault(dept,0.0);
            ans.put(dept,salary+agg);
        }
        return ans;
    }
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Surya", "IT", 80000),
                new Employee(102, "Rohit", "HR", 60000),
                new Employee(103, "Bumrah", "IT", 90000),
                new Employee(104, "Axar", "Finance", 70000),
                new Employee(105, "Gill", "HR", 50000)
        );
        Map<String,Double> ans=getDepartmentSalary(employees);
        for(Map.Entry<String,Double> it:ans.entrySet()){
            System.out.println(it.getKey()+" -> "+it.getValue());
        }
    }
}
