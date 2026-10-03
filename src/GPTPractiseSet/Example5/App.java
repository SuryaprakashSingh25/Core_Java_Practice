package GPTPractiseSet.Example5;

public class App {
    public static void main(String[] args) {
        NotificationService notification = new EmailNotification();
        OrderService orderService=new OrderService(notification);
        orderService.createOrder("ORD1001","abc@gmail.com");
    }
}
