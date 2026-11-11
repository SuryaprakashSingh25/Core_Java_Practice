package JavaPractiseSet.Comparators;

public class Employee implements Comparable<Employee>{
    private final String name;
    private final double salary;
    private final int age;

    public Employee(String name,double salary,int age){
        this.name=name;
        this.salary=salary;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}
