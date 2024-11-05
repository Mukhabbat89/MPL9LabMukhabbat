// Candle.java
// Class representing a basic Candle for a candle-making business.

public class Candle {
    // Data fields for color, height, and price
    private String color;
    private double height;
    public double price;

    // Get methods for each field
    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }

    // Set method for color
    public void setColor(String color) {
        if (color != null && !color.trim().isEmpty()) {
            this.color = color;
        } else {
            System.out.println("Invalid color input.");
        }
    }

    // Set method for height, which also sets the price at $2 per inch
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
            this.price = height * 2;  // Price calculation: $2 per inch
        } else {
            System.out.println("Height must be positive.");
        }
    }
}
