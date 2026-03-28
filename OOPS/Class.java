import java.util.*;
//  Class is a blueprint or template used to create objects. It contains variables and methods that define the properties and behavior of an object.
class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Car is driving");
    }
}

public class Class {
    public static void main(String[] args) {
        Car c1 = new Car();  // Object creation

        c1.color = "Red";
        c1.speed = 100;

        System.out.println(c1.color);
        System.out.println(c1.speed);

        c1.drive();
    }
}