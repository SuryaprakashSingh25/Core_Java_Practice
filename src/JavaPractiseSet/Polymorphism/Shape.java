package JavaPractiseSet.Polymorphism;

public abstract class Shape {

    public abstract double area();

    public void describe(){
        System.out.println("I am a "+ getClass().getSimpleName() +" shape with area "+area());
    }
}
