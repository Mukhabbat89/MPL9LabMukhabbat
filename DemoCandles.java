// DemoCandles.java
// Application to demonstrate Candle and ScentedCandle classes.

import java.util.Scanner;

public class DemoCandles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and set up a basic Candle
        Candle basicCandle = new Candle();
        System.out.print("Enter the color of the Candle: ");
        basicCandle.setColor(scanner.nextLine());

        System.out.print("Enter the height of the Candle (in inches): ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid number for height.");
            scanner.next(); // Clear invalid input
        }
        basicCandle.setHeight(scanner.nextDouble());
        scanner.nextLine();  // Consume newline

        // Create and set up a ScentedCandle
        ScentedCandle scentedCandle = new ScentedCandle();
        System.out.print("Enter the color of the Scented Candle: ");
        scentedCandle.setColor(scanner.nextLine());

        System.out.print("Enter the height of the Scented Candle (in inches): ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid number for height.");
            scanner.next();
        }
        scentedCandle.setHeight(scanner.nextDouble());
        scanner.nextLine();  // Consume newline

        // Scent options for ScentedCandle
        System.out.println("Enter the scent for the Scented Candle (e.g., Lavender, Gardenia, Vanilla, Rose): ");
        scentedCandle.setScent(scanner.nextLine());

        // Display details for each candle
        System.out.println("\nCandle Details:");
        System.out.println("Color: " + basicCandle.getColor());
        System.out.println("Height: " + basicCandle.getHeight() + " inches");
        System.out.println("Price: $" + basicCandle.getPrice());

        System.out.println("\nScented Candle Details:");
        System.out.println("Color: " + scentedCandle.getColor());
        System.out.println("Height: " + scentedCandle.getHeight() + " inches");
        System.out.println("Scent: " + scentedCandle.getScent());
        System.out.println("Price: $" + scentedCandle.getPrice());

        scanner.close();
    }
}
