package JavaPractiseSet.Comparators;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> empList=Arrays.asList(
                new Employee("Surya",12000,31),
                new Employee("Rohit",12000,34),
                new Employee("Virat",10000,33),
                new Employee("Bumrah",11500,33),
                new Employee("Jadeja",12500,35),
                new Employee("Rohit",14000,32)
                //new Employee(null,11540,39)
        );
        Collections.sort(empList);
        //Collections.sort(empList,(a,b) -> Double.compare(b.getSalary(),a.getSalary()));
        //empList.sort(Comparator.comparingDouble(Employee::getSalary).reversed().thenComparingInt(Employee::getAge).thenComparing(Employee::getName));
        //empList.sort(Comparator.comparing(Employee::getName,Comparator.nullsFirst(Comparator.naturalOrder())));
        for(Employee e:empList){
            System.out.println(e);
        }

//        PriorityQueue<Employee> pq=new PriorityQueue<>(Comparator.comparingDouble(Employee::getSalary).reversed());
//        pq.addAll(empList);
//        System.out.println(pq);
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }

    }
}
