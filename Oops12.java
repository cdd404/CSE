class MyThread extends Thread {
    public MyThread() {
        super(); 
    }


public void run() {
    for (int i = 0; i < 5; i++) {
        System.out.println("Child Thread: " + i);
    }
}


public static void main(String[] args) {
    MyThread childThread = new MyThread();
    childThread.start();   // starts the child thread

    for (int i = 0; i < 5; i++) {
        System.out.println("Main Thread: " + i);
    }
}
