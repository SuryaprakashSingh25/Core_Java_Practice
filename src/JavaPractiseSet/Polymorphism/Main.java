package JavaPractiseSet.Polymorphism;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes= Arrays.asList(
                new Circle(2),
                new Rectangle(3,4)
        );

        for(Shape shape:shapes){
            shape.describe();
        }
    }
}
