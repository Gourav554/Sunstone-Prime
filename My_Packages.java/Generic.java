
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