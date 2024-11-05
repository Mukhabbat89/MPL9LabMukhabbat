// DemoTees.java
import java.util.Scanner;

public class DemoTees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and display details for two TeeShirt objects
        TeeShirt shirt1 = new TeeShirt();
        TeeShirt shirt2 = new TeeShirt();

        System.out.println("Enter details for TeeShirt 1:");
        setShirtDetails(shirt1, scanner);

        System.out.println("\nEnter details for TeeShirt 2:");
        setShirtDetails(shirt2, scanner);

        // Create and display details for two CustomTee objects
        CustomTee customShirt1 = new CustomTee();
        CustomTee customShirt2 = new CustomTee();

        System.out.println("\nEnter details for CustomTee 1:");
        setCustomShirtDetails(customShirt1, scanner);

        System.out.println("\nEnter details for CustomTee 2:");
        setCustomShirtDetails(customShirt2, scanner);

        // Display details
        System.out.println("\nDetails of TeeShirt 1:");
        displayShirtDetails(shirt1);

        System.out.println("\nDetails of TeeShirt 2:");
        displayShirtDetails(shirt2);

        System.out.println("\nDetails of CustomTee 1:");
        displayCustomShirtDetails(customShirt1);

        System.out.println("\nDetails of CustomTee 2:");
        displayCustomShirtDetails(customShirt2);

        scanner.close();
    }

    // Method to set details for a TeeShirt object
    private static void setShirtDetails(TeeShirt shirt, Scanner scanner) {
        System.out.print("Enter order number: ");
        int orderNumber = scanner.nextInt();
        shirt.setOrderNumber(orderNumber);

        System.out.print("Enter size (S, M, L, XL, XXL, XXXL): ");
        String size = scanner.next();
        shirt.setSize(size);

        System.out.print("Enter color: ");
        String color = scanner.next();
        shirt.setColor(color);
    }

    // Method to set details for a CustomTee object
    private static void setCustomShirtDetails(CustomTee customShirt, Scanner scanner) {
        setShirtDetails(customShirt, scanner);

        System.out.print("Enter slogan: ");
        scanner.nextLine();  // Consume newline left-over
        String slogan = scanner.nextLine();
        customShirt.setSlogan(slogan);
    }

    // Method to display details of a TeeShirt object
    private static void displayShirtDetails(TeeShirt shirt) {
        System.out.println("Order Number: " + shirt.getOrderNumber());
        System.out.println("Size: " + shirt.getSize());
        System.out.println("Color: " + shirt.getColor());
        System.out.println("Price: $" + shirt.getPrice());
    }

    // Method to display details of a CustomTee object
    private static void displayCustomShirtDetails(CustomTee customShirt) {
        displayShirtDetails(customShirt);
        System.out.println("Slogan: " + customShirt.getSlogan());
    }
}
