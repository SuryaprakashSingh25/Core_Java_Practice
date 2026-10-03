package PractiseSet.MultiInheritanc;

public class NotificationMain {
    public static void main(String[] args) {
        NotificationService notification;

        notification = new EmailNotification();
        notification.send("abc@gmail.com", "Your order has shipped");

        notification = new SMSNotification();
        notification.send("9876543210", "Your OTP is 1234");
    }
}
