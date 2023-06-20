

package methods;
public class MethodOverloading {

    public void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    public void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    public void area(double radius) {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        obj.area(5); // Invokes the area method with one parameter (square)
        obj.area(4, 6); // Invokes the area method with two parameters (rectangle)
        obj.area(3.5); // Invokes the area method with one parameter (circle)
    }
}
