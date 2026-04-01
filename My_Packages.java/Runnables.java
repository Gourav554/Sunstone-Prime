public class Runnables{

    static class MyThread implements Runnable {
        public void run() {
            for(int i=0; i<5; i++) {
                System.out.println("Thread running");
            }
        }
    }

    public static void main(String[] args) {
        //MULTIPLE THRESADS BANANE KE LIYE HUM RUNNABLE INTERFACE USE KAR SAKTE HAIN
        MyThread t1 = new MyThread();
        Thread thread1 = new Thread(t1);//helper class Thread ka object banaya aur usme MyThread ka object pass kiya
        thread1.start();
    }
}

// Runnable ek interface hai
// Isme sirf ek method hota hai: run()
// Aap apni class me logic likhte ho run() ke andar