public class Main {
    public static void main(String[] args) {
        // Demonstrate Interface Segregation Principle (ISP)
        Notifier emailNotifier = new Notifier(new EmailNotificationService());
        emailNotifier.doNotify("Important email notification!");

        Notifier photoNotifier = new Notifier(new PhotoPrinterAdapter(new ConcretePhotoPrinter()));
        photoNotifier.doNotify("Photo printing notification!");

    }
}
