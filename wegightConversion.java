import java.util.Scanner;

public class wegightConversion {
    public static void main(String[] args) {
        
        // Weight conversion Program 
        /*1. Declare variables 
        2. Welcome message 
        3. prompt for user choice
        4. option one convert lbs to kg
        5. option two convert kg to lbs 
        6. else print not a valid choice*/

        Scanner scanner = new Scanner(System.in);
        
        double weight; 
        double newWeight;
        int choice; 
        System.out.println("Weight conversion program.");
        System.out.println("1. Convert lbs to kgs.");
        System.out.println("2. Convert kgs to lbs.");

        System.out.println("Choose an option: ");
        choice = scanner.nextInt();

        if(choice == 1)
        {
            System.out.print("Enter your weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.4539237;
            System.out.printf("The new weigth in kgs is: %.2f\n",  newWeight);
            
        }else if(choice == 2)
        {
            System.out.print("Enter your weight in kg: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weigth in lbs is: %.2f\n",  newWeight);
        }
        else {
            System.out.println("Invalid Choice.\n");
        }
        scanner.close();
    }
}
