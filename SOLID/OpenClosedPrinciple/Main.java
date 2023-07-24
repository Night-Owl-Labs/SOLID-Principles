public class Main {
    public static void main(String[] args) {
        // Demonstrate Open/Closed Principle (OCP)
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 3.0);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());
    }
}
