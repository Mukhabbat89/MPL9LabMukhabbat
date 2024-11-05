// ScentedCandle.java
// Class representing a scented candle, which is a specialized version of Candle.

public class ScentedCandle extends Candle {
    // Additional field for scent
    private String scent;
    private double price;
    // Get method for scent
    public String getScent() {
        return scent;
    }

    // Set method for scent
    public void setScent(String scent) {
        if (scent != null && !scent.trim().isEmpty()) {
            this.scent = scent;
        } else {
            System.out.println("Invalid scent input.");
        }
    }

    // Override setHeight to set price at $3 per inch for ScentedCandle
    @Override
    public void setHeight(double height) {
        if (height > 0) {
           this.price = height * 3;  // Scented Candle: $3 per inch
           System.out.println("Height done");
        } else {
            System.out.println("Height must be positive.");
        }
    }

    @Override
    public double getPrice() {
        return price;
    }

}
