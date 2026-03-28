import java.util.*;
// | Concept | Example               |
// | ------- | --------------------- |
// | Class   | Mobile ka design      |
// | Object  | Samsung phone, iPhone |


class Student {
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Object {
    public static void main(String[] args) {
        Student s1 = new Student();  // Object

        s1.name = "Rahul";
        s1.age = 20;

        s1.display();
    }
}
