// SMSNotificationService class (low-level module) implementing the NotificationService interface
public class SMSNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        // Code to send an SMS notification
        System.out.println("Sending SMS notification: " + message);
    }
}
