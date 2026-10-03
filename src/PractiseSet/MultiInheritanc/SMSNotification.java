package PractiseSet.MultiInheritanc;

public class SMSNotification implements NotificationService{
    @Override
    public void send(String recipient, String message) {
        System.out.println("SMS Notification");
    }
}
