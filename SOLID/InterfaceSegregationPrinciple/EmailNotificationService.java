// EmailNotificationService class (low-level module) implementing the NotificationService interface
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        // Code to send an email notification
        System.out.println("Sending email notification: " + message);
    }
}
