package practice_project_8;

class Car {
    String brand;
    String model;
    int year;

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class Classes_Objects {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2021;

        myCar.displayInfo();
    }
}
