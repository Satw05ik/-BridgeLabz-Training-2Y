
class Order {
    int orderId;
    String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void getOrderStatus() {
        System.out.println("Order placed on: " + orderDate);
    }
}


class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void getOrderStatus() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Status: Order has been shipped.");
    }
}


class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void getOrderStatus() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Status: Order has been delivered.");
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {

        Order o1 = new Order(101, "14-Sep-2025");
        System.out.println("=== Order Details ===");
        o1.getOrderStatus();

        System.out.println("\n=== Shipped Order Details ===");
        ShippedOrder so1 = new ShippedOrder(102, "12-Sep-2025", "TRK12345");
        so1.getOrderStatus();

        System.out.println("\n=== Delivered Order Details ===");
        DeliveredOrder d1 = new DeliveredOrder(103, "10-Sep-2025", "TRK67890", "13-Sep-2025");
        d1.getOrderStatus();
    }
}
