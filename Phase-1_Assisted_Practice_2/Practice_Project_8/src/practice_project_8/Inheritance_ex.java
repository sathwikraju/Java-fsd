package practice_project_8;

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Cars extends Vehicle {
    void drive() {
        System.out.println("Car is being driven");
    }
}

public class Inheritance_ex {
    public static void main(String[] args) {
        Cars myCar = new Cars();
        myCar.start();
        myCar.drive();
    }
}
