public class OrderController {
    private OrderRepo orderRepo;

    public OrderController(OrderRepo orderRepo){
        this.orderRepo = orderRepo;
    }
    void create(String id){
        orderRepo.save(id);
        System.out.println("Created order: " + id);
    }
}