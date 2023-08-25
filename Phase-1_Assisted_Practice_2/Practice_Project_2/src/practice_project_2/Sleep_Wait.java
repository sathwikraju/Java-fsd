package practice_project_2;


public class Sleep_Wait{
    public static void main(String[] args) {
        Object lock = new Object();

        // Sleep Example
        Thread sleepThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Sleep Thread: Entering sleep...");
                    Thread.sleep(3000); // Sleep for 3 seconds
                    System.out.println("Sleep Thread: Waking up from sleep.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Wait Example
        Thread waitThread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    try {
                        System.out.println("Wait Thread: Entering wait...");
                        lock.wait(); // Wait until notified by another thread
                        System.out.println("Wait Thread: Resuming execution after wait.");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        sleepThread.start();
        waitThread.start();
        
        // Main Thread sleeping for 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Main Thread notifying the waitThread to resume
        synchronized (lock) {
            System.out.println("Main Thread: Notifying wait thread to resume.");
            lock.notify();
        }
    }
}
