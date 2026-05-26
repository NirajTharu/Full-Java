public class methodOverRiding {
    public static void main(String[] args) {
        
        // Method Over riding: When a subclass provieds its own implementation of a method that is already defined.
        // Allows for code reusability and gives specific implementation.

        cow cow = new cow();
        cockroach cockroach = new cockroach();
        fish fish = new fish();

        cow.move();
        cockroach.move();
        fish.move();
    }
}
