import java.util.Scanner;

public class runTimePolymorphism {
    public static void main(String[] args) {
        
        // Runtime polymorphism/Dynamic polymorphism: When the method that get executed is decided at runtime based on a actual type of the object.

        Scanner scanner = new Scanner(System.in);
        beast beast;

        System.out.print("Would you like a duck or a hen?:(1 = duck , 2 = hen): ");
        int choice = scanner.nextInt();

        if(choice == 1)
        {
            beast = new duck();
            beast.speak();
        }
        else if(choice == 2)
        {
            beast = new hen();
            beast.speak();
        }
        else{
            System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}
