class Student {
    String name;
    int age;

    // Constructor 1
    Student(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor 2
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Constructor_overloading {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob");

        System.out.println("Student 1: " + s1.name + ", Age: " + s1.age);
        System.out.println("Student 2: " + s2.name + ", Age: " + s2.age);
    }
}