public class Main {
    public static void main(String[] args) {
        // Demonstrate Dependency Inversion Principle (DIP)
        Notifier smsNotifier = new Notifier(new SMSNotificationService());
        smsNotifier.doNotify("Text message notification!");
    }
}
