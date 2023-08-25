package constructor;
public class ConstructorVerification {
    
    private int value;
    private String name;

    // Default constructor
    public ConstructorVerification() {
        System.out.println("Default constructor called");
        value = 0;
        name = "Default";
    }

    // Constructor with parameters
    public ConstructorVerification(int v, String n) {
        System.out.println("Parameterized constructor called");
        value = v;
        name = n;
    }

    // Copy constructor
    public ConstructorVerification(ConstructorVerification obj) {
        System.out.println("Copy constructor called");
        value = obj.value;
        name = obj.name;
    }

    public void display() {
        System.out.println("Value: " + value);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        // Create objects using different constructors
        ConstructorVerification obj1 = new ConstructorVerification();
        ConstructorVerification obj2 = new ConstructorVerification(23425, "Michael");
        ConstructorVerification obj3 = new ConstructorVerification(obj2);

        // Display object details
        obj1.display();
        obj2.display();
        obj3.display();
    }
}
