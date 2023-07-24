public class Main {
    public static void main(String[] args) {
        // Demonstrate Single Responsibility Principle (SRP)
        User user = new User("john_doe", "john@example.com", "mypassword");
        user.saveToDatabase();
        User fetchedUser = User.getUserFromDatabase("john_doe");
        System.out.println("Fetched user: " + fetchedUser.getUsername() + " - " + fetchedUser.getEmail());

    }
}
