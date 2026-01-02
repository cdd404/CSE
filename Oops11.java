class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
            Thread.sleep(500);
            System.out.println("Thread " + Thread.currentThread().getId() + " is awake.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



public class ThreadExample {
    public static void main(String[] args) {
        int numberOfThreads = 5;
        for (int i = 0; i < numberOfThreads; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }
}
