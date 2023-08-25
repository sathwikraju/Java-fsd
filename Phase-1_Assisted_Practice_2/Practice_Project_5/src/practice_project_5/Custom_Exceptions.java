package practice_project_5;

class MyException extends Exception 
{ 
    public MyException(String message) 
    { 
        super(message); 
    } 
} 
public class Custom_Exceptions 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyException("try block"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("catch  block"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}
