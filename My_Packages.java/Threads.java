
    class MyThread extends Thread {
    public void run() {
        System.out.println("Thread class running");
        
        // Sleep for a while to simulate some work
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        MyThread t2= new MyThread();
        t2.start();
    }
}

// Thread ek class hai
// Aap ise directly extend kar sakte ho
// Isme bhi run() method override karte hain