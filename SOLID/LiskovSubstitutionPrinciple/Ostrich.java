public class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches cannot fly.");
    }

    @Override
    public void run() {
        System.out.println("Ostrich is running.");
    }
}
