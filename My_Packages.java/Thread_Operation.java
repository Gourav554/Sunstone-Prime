    class MyThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " is running: " + i);
                Thread.sleep(1000); // sleep for 1 second
            }
        } catch (InterruptedException e) {
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

