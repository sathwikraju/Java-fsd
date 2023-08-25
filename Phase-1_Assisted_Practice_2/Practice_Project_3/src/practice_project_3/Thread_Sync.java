package practice_project_3;


class Sender {
    public void send(String msg) {
        System.out.println("Sending\t" + msg);

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread interrupted.");}
        
        System.out.println("\n" + msg + " Sent ");
    }
}

class ThreadedSend extends Thread {
    private String msg;
    Sender sender;

    ThreadedSend(String m, Sender obj) {
        msg = m;
        sender = obj;
    }

    public void run() {
        synchronized (sender) {
            sender.send(msg);
        }
    }
}
public class Thread_Sync {
    public static void main(String[] args) {
        Sender snd = new Sender();
        ThreadedSend s1 = new ThreadedSend("Hi", snd);
        ThreadedSend s2 = new ThreadedSend("Bye", snd);

        s1.start();
        s2.start();

        try {
            s1.join();
            s2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }



}
