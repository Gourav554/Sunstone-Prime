import java.util.*;
abstract class Animal {
    abstract void sound(); // abstract method

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Barking");
    }
}

public class Abstract_class {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();  // Barking
        d.sleep();  // Sleeping...
    }
}

//    Animal ek abstract class hai
//    sound() ka implementation hidden hai
//    Dog usko define karta hai