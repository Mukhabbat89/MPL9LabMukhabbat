// TeeShirt.java
public class TeeShirt {
    private int orderNumber;
    private String size;
    private String color;
    private double price;

    // Set method for orderNumber with validation
    public void setOrderNumber(int orderNumber) {
        if (orderNumber > 0) {
            this.orderNumber = orderNumber;
        } else {
            System.out.println("Invalid order number. Must be positive.");
        }
    }

    // Set method for size with validation
    public void setSize(String size) {
        if (size.equalsIgnoreCase("XXL") || size.equalsIgnoreCase("XXXL")) {
            this.price = 22.99;
        } else {
            this.price = 19.99;
        }
        this.size = size;
    }

    // Set method for color
    public void setColor(String color) {
        this.color = color;
    }

    // Get methods
    public int getOrderNumber() {
        return orderNumber;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}
