public class PhotoPrinterAdapter implements NotificationService {
    private PhotoPrinter photoPrinter;

    public PhotoPrinterAdapter(PhotoPrinter photoPrinter) {
        this.photoPrinter = photoPrinter;
    }

    @Override
    public void sendNotification(String message) {
        // Code to send a notification via the photo printer
        photoPrinter.printPhoto(message);
    }
}
