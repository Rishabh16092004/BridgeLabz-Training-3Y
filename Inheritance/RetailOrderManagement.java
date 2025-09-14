class Order{
    String orderID;
    String orderDate;

    Order(String orderID, String orderDate){
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    String getOrderStatus(){
        return "Order placed on"+orderDate;
    }
}

class ShippedOrder extends Order{
    String trackingNumber;
    ShippedOrder(String orderID, String orderDate, String trackingNumber){
        super(orderID,orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus(){
        return super.getOrderStatus() + " | Shipped with Tracking Number: "+trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder{
    String deliveryDate;
    DeliveredOrder(String orderID,String orderDate,String trackingNumber, String deliveryDate){
        super(orderID,orderDate,trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus(){
        return super.getOrderStatus() + " | Delivered on: "+deliveryDate;
    }
}

public class RetailOrderManagement {
    public static void main(String[] args) {
        Order o1 = new Order("O101", "2025-09-01");
        ShippedOrder o2 = new ShippedOrder("O102", "2025-09-02", "TRK12345");
        DeliveredOrder o3 = new DeliveredOrder("O103", "2025-09-03", "TRK67890", "2025-09-05");

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}
