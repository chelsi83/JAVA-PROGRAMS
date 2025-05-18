class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " running, value: " + i);
            try {
                Thread.sleep(400); // Sleep for 400 ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadExample2 {
    public static void main(String[] args) {
        Runnable r1 = new MyRunnable();
        Runnable r2 = new MyRunnable();

        Thread t1 = new Thread(r1, "RunnableThread-1");
        Thread t2 = new Thread(r2, "RunnableThread-2");

        t1.start();
        t2.start();
    }
}
