package practice_project_1;

public class Threads_Runnable {
    public static void main(String args[]) {
        Runnable obj1 = new Runnable() {
        public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 1...");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) { e.printStackTrace();}
        }
    }
            
        };
        Runnable obj2 = new Runnable() {
        public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 2...");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) { e.printStackTrace();}
        }
    }
            
        };
        
        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);
        
        thread1.start();
        thread2.start();
    }
}