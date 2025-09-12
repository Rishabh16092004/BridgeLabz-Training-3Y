public class PRODUCT {
    private static double discount = 0.0;
    // Instance variables
    private final String productID; // Final variable to ensure the unique identifier cannot be changed
    private String productName;
    private double price;
    private int quantity;
    // Constructor to initialize productName, price, and quantity
    public PRODUCT(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0.0 && newDiscount <= 100.0) {
            discount = newDiscount;
        } else {
            System.out.println("Invalid discount percentage. Please enter a value between 0 and 100.");
        }
    }
    public double getDiscountedPrice() {
        return price - (price * discount / 100);
    }
    public void displayProductDetails() {
        if (this instanceof PRODUCT) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price after Discount: $" + getDiscountedPrice());
        } else {
            System.out.println("The object is not an instance of the Product class.");
        }
    }
    public String getProductID() {
        return productID;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public static void main(String[] args) {
        // Update the discount for all products
        PRODUCT.updateDiscount(10.0); // 10% discount
        // Create new product instances
        PRODUCT product1 = new PRODUCT("P001", "Laptop", 1200.00, 5);
        PRODUCT product2 = new PRODUCT("P002", "Smartphone", 800.00, 10);
        // Display product details
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
    }

}
