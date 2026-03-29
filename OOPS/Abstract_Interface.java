interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }
}
public class Abstract_Interface{
    public static void main(String[] args) {
        Car c = new Car();
        c.start();  // Car starts with key
    }
}