package PractiseSet.MultiInheritanc;

public class PushNotification implements NotificationService{
    @Override
    public void send(String recipient, String message) {
        System.out.println("Push Notification");
    }
}
