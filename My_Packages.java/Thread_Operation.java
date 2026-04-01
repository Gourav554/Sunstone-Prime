    class MyThread extends Thread {   //  class Thread ban Jyegi
    public void run() {   // thread ka main kaam (task) hota hai
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " is running: " + i);   // jo thread abhi run ho raha hai
// getName() → uska naam return karta hai
                Thread.sleep(1000); // sleep for 1 second
            }
        } catch (InterruptedException e) {  //Agar thread interrupt ho jaye (sleep ke time), toh ye handle karega
            System.out.println("Thread interrupted");
        }
    }
}

public class Thread_Operation {
    public static void main(String[] args) {
        
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        // Start threads
        t1.start();
        t2.start();

        try {
            // Wait for t1 to finish
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if threads are alive
        System.out.println("Is t1 alive? " + t1.isAlive());
        System.out.println("Is t2 alive? " + t2.isAlive());

        System.out.println("Main thread finished");
    }
}

