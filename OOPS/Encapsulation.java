
class Student {
    private String name;  // data hidden

    // Setter method (data set karne ke liye)
    public void setName(String name) {
        this.name = name;
    }

    // Getter method (data get karne ke liye)
    public String getName() {
        return name;
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Rahul");        // set value
        System.out.println(s.getName()); // get value
    }
}