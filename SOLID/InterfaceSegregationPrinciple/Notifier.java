// Notifier class (high-level module) depending on the NotificationService abstraction
public class Notifier {
    private NotificationService notificationService;

    public Notifier(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void doNotify(String message) {
        notificationService.sendNotification(message);
    }
}
