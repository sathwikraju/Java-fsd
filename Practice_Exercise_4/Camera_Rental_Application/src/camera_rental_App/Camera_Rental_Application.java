package camera_rental_App;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Camera_Rental_Application {
    private static List<Camera> cameraList = new ArrayList<>();
    private static double walletBalance = 0;

    public static void main(String[] args) {
        displayWelcomeScreen();
        showMainMenu();
    }

    private static void displayWelcomeScreen() {
        System.out.println("Welcome to rentmycam.io");
        System.out.println("Developed by [Your Name]\n");
    }

    private static void showMainMenu() {
        while (true) {
            System.out.println("\n---- Main Menu ----");
            System.out.println("1. List a Camera");
            System.out.println("2. Display Available Cameras");
            System.out.println("3. Rent a Camera");
            System.out.println("4. Manage Wallet Balance");
            System.out.println("5. Close the Application");

            int choice = getUserChoice(5);
            switch (choice) {
                case 1:
                    listCamera();
                    break;
                case 2:
                    displayAvailableCameras();
                    break;
                case 3:
                    rentCamera();
                    break;
                case 4:
                    manageWalletBalance();
                    break;
                case 5:
                    closeApplication();
                    break;
            }
        }
    }

    private static void listCamera() {
        System.out.println("\n---- List a Camera ----");
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter camera brand: ");
			String brand = scanner.nextLine();

			System.out.print("Enter camera model: ");
			String model = scanner.nextLine();

			double rentalAmount = getPositiveDoubleInput("Enter per-day rental amount: ");
			cameraList.add(new Camera(brand, model, rentalAmount));
		}

        System.out.println("Camera listed successfully!");
    }

    private static void displayAvailableCameras() {
        System.out.println("\n---- Available Cameras ----");
        if (cameraList.isEmpty()) {
            System.out.println("No Data Present at This Moment");
        } else {
            for (Camera camera : cameraList) {
                System.out.println(camera);
            }
        }
    }

    private static void rentCamera() {
        System.out.println("\n---- Rent a Camera ----");
        if (cameraList.isEmpty()) {
            System.out.println("No cameras available for rent.");
            return;
        }

        displayAvailableCameras();
        int cameraIndex = getUserChoice(cameraList.size()) - 1;
        Camera selectedCamera = cameraList.get(cameraIndex);

        if (selectedCamera.getRentalAmount() > walletBalance) {
            System.out.println("Insufficient wallet amount. Please deposit more funds.");
        } else {
            walletBalance -= selectedCamera.getRentalAmount();
            System.out.println("Camera rented successfully!");
        }
    }

    private static void manageWalletBalance() {
        while (true) {
            System.out.println("\n---- Wallet Management ----");
            System.out.println("1. Add Amount");
            System.out.println("2. View Amount");
            System.out.println("3. Return to Main Menu");

            int choice = getUserChoice(3);
            switch (choice) {
                case 1:
                    addWalletAmount();
                    break;
                case 2:
                    viewWalletAmount();
                    break;
                case 3:
                    return;
            }
        }
    }

    private static void addWalletAmount() {
        System.out.println("\n---- Add Amount ----");
        double amount = getPositiveDoubleInput("Enter the amount to deposit: ");
        walletBalance += amount;
        System.out.println("Amount deposited successfully!");
    }

    private static void viewWalletAmount() {
        System.out.println("\n---- View Amount ----");
        System.out.println("Wallet Balance: " + walletBalance);
    }

    private static void closeApplication() {
        System.out.println("\nClosing the application. Thank you!");
        System.exit(0);
    }

    private static int getUserChoice(int maxChoice) {
		Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your choice: ");
            try {
                int choice = scanner.nextInt();
                if (choice >= 1 && choice <= maxChoice) {
                    return choice;
                } else {
                    System.out.println("Invalid choice! Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid choice.");
                scanner.nextLine(); // Clear the input buffer
            }
        }
    }

    private static double getPositiveDoubleInput(String message) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(message);
            try {
                double input = scanner.nextDouble();
                if (input > 0) {
                    return input;
                } else {
                    System.out.println("Invalid input! Please enter a positive value.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); // Clear the input buffer
            }
        }
    }
}

class Camera {
    private String brand;
    private String model;
    private double rentalAmount;

    public Camera(String brand, String model, double rentalAmount) {
        this.brand = brand;
        this.model = model;
        this.rentalAmount = rentalAmount;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getRentalAmount() {
        return rentalAmount;
    }

    @Override
    public String toString() {
        return "Camera: " + brand + " " + model + " | Rental Amount: " + rentalAmount;
    }
}
