import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionInJava {
    public static void main(String[] args) {
        
        // Exception in java
        // An event that interuppts the normal flow of the program (Divided by zero, File not found, mismatch input type)
        // Surround any dangerous code with a try{} block
        // try{}, catch{}, finally{} 

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter a number: ");
            scanner.nextLine();
        }
        catch(InputMismatchException e){
            System.out.println("That was't a number.");
        }
        catch(ArithmeticException a)
        {
            System.out.println("You can't divide it by zero.");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong.");
        }
        finally{
            System.out.println("This always executes.");
        }

        scanner.close();
    }
}
