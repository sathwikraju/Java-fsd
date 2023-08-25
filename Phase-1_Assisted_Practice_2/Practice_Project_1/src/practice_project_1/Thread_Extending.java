package practice_project_1;

class Threads extends Thread 
{

    public void run() 
    {

        System.out.println("This is a new Thread....");
    }

}

public class Thread_Extending {
    public static void main(String args[]) 
    {
        // Creating an object for Threads
        Threads obj1 = new Threads();
        obj1.start();
    }
}
