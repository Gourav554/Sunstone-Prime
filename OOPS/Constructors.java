import java.util.*;
class Student{
    String name;
    int age;
    // Constructor
    Student(String name, int age) {
        this.name = name; // 'this' keyword is used to refer to the current object
        this.age = age;
    }
}
public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 22);
        System.out.println("Student 1: " + s1.name + ", Age: " + s1.age);
        System.out.println("Student 2: " + s2.name + ", Age: " + s2.age);
    }
}
