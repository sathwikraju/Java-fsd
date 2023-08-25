package Access_modifiers;

class defaccessmod
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 
public class Default {

	public static void main(String[] args) {
		System.out.println("Dafault Access Specifier");
		defaccessmod d = new defaccessmod(); 		  
        d.display(); 

	}
}

