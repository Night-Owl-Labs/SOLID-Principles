public class ConcretePhotoPrinter implements PhotoPrinter {
    @Override
    public void printPhoto(String photo) {
        System.out.println("Printing photo: " + photo);
    }
}
