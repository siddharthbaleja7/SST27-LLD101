public class Demo09 {
    public static void main(String[] args) {
        // This Demo Violates SRP and DIP
        OrderRepo orderRepo = new SqlOrderRepository();
        OrderController orderController = new OrderController(orderRepo);
        orderController.create("ORD-1");
    }
}
