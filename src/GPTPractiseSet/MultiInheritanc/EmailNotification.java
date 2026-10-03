package GPTPractiseSet.MultiInheritanc;

public class EmailNotification implements NotificationService{
    @Override
    public void send(String recipient, String message){
        System.out.println("Email Notification");
    }
}
