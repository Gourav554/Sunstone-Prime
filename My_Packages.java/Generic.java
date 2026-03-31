
    class Test {
    public <T> void print(T data) {
        System.out.println(data);
    }
}

public class Generic {
    public static void main(String[] args) {

        Test t = new Test();

        t.print("Hello");
        t.print(100);
        t.print(12.5);
    }
}

//Generic class and method allow us to write code that can work with any data type. In the above example, the Test class has a generic method print() that can accept any type of data. When we call the print() method with different types of data (String, Integer, Double), it works without any issues, demonstrating the flexibility of generics in Java.
// Generic  Class Safe and resuable code