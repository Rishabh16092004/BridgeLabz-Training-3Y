package Object;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        double total = 0;
        for (Product p : products) {
            System.out.println(" - " + p.getName() + " : " + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total: " + total);
    }
}

class Customers {
    private String name;
    private List<Order> orders;

    public Customers(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order ID: " + order.getOrderId());
    }

    public void showCustomerOrders() {
        System.out.println("Customer: " + name);
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Phone", 25000);
        Product p3 = new Product("Headphones", 3000);

        Customers c1 = new Customers("Ravi");
        Customers c2 = new Customers("Priya");

        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p3);

        Order o2 = new Order(102);
        o2.addProduct(p2);

        c1.placeOrder(o1);
        c2.placeOrder(o2);

        System.out.println();
        c1.showCustomerOrders();
        System.out.println();
        c2.showCustomerOrders();
    }
}


