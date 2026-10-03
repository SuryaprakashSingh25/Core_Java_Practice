package GPTPractiseSet.Example5;

public class OrderService {
    private NotificationService notificationService;
    public OrderService(NotificationService notificationService){
        this.notificationService=notificationService;
    }

    public void createOrder(String orderId, String customerEmail){
        System.out.println("Order "+orderId+" created successfully");
        notificationService.send(customerEmail,"Send notifier");
    }
}
