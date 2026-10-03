package PractiseSet.Inheritance;

public class Employee {
    private final int id;
    private final String name;
    private final double salary;

    public Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void displayDetails(){
        System.out.println("Name: "+name+" Salary: "+salary);
    }

    public double calculateBonus(){
        return salary*0.1;
    }

    public double getSalary(){
        return salary;
    }

}
