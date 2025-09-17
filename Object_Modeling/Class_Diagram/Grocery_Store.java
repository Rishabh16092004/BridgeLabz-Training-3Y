package Class_Diagram;
import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private int quantity;
    private double pricePerUnit;

    public Product(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double getTotalPrice() {
        return quantity * pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}

class Customer {
    private String name;
    private List<Product> products;

    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }
}
class BillGenerator {
    public double generateBill(Customer customer) {
        double total = 0;
        for (Product p : customer.getProducts()) {
            total += p.getTotalPrice();
        }
        return total;
    }
}
public class Grocery_Store {
    public static void main(String[] args) {
        Customer alice = new Customer("Alice");
        alice.addProduct(new Product("Apples", 2, 3.0));  // 2 kg at $3
        alice.addProduct(new Product("Milk", 1, 2.0));    // 1 liter at $2

        BillGenerator billGen = new BillGenerator();
        double totalBill = billGen.generateBill(alice);

        System.out.println("Customer: " + alice.getName());
        for (Product p : alice.getProducts()) {
            System.out.println(p.getName() + " - "
                    + p.getQuantity() + " units at $" + p.getPricePerUnit()
                    + " each => $" + p.getTotalPrice());
        }
        System.out.println("Total Bill: $" + totalBill);
    }
}

