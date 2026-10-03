package PractiseSet.Map.Emp;

import java.util.LinkedHashMap;
import java.util.Map;

public class EmpMain {
    public static Map<Integer,Employee> createEmployeeMap(Employee[] employees){
        Map<Integer,Employee> ans=new LinkedHashMap<>();
        for(Employee it:employees){
            ans.put(it.getId(),it);
        }
        return ans;
    }
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(101, "Surya"),
                new Employee(102, "Rohit"),
                new Employee(101, "Surya"),
                new Employee(103, "Bumrah")
        };

        Map<Integer,Employee> ans=createEmployeeMap(employees);
        for(Map.Entry<Integer,Employee> it:ans.entrySet()){
            System.out.println(it.getKey() +" -> "+it.getValue().getName());
        }
    }
}
