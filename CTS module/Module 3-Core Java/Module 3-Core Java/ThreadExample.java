class MyThread implements Runnable {
    private String message;

    MyThread(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message + " - " + (i + 1));
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread("Thread 1"));
        Thread t2 = new Thread(new MyThread("Thread 2"));

        t1.start();
        t2.start();
    }
}
