package PractiseSet.Example5;

public class EmailNotification implements NotificationService{
    @Override
    public void send(String recipient, String message) {
        System.out.println("User: "+recipient+" Message: "+message);
    }
}
