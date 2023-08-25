package Access_modifiers;

class privateaccess 
{ 
   void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

public class Private {

	public static void main(String[] args) {
		System.out.println("Private Access Specifier");
		privateaccess  p = new privateaccess(); 

		p.display();

	}
}

