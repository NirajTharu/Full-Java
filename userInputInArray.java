import java.util.Arrays;
import java.util.Scanner;

public class userInputInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int sizeoFArray;
        String[] foods;

        System.out.print("What number of food you want?: ");
        sizeoFArray = scanner.nextInt();
        
        // To clear the input buffer
        scanner.nextLine();

        // To initialize the size of array
        foods = new String[sizeoFArray];
        
        for(int i = 0; i < foods.length; i++)
        {
            System.out.println("Enter food Name: ");
            foods[i] = scanner.nextLine();
        }

        // Enhanced for loop
        System.out.println("The list of food is below: ");
        for(String food : foods)
        {
            System.out.println(food);
        }

        scanner.close();
    }
}
