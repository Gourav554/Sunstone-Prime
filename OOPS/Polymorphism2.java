// Compile-Time Polymorphism (Method Overloading)
import java.util.*;
class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Polymorphism2 {
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();
        System.out.println(mo.add(5, 10));       
        System.out.println(mo.add(5, 10, 15));   // Output: 30
    }
}