import java.util.Scanner;
import java.util.ArrayList;

public class arrayListExercise {
    public static void main(String[] args) {
        
        // ArrayList Exercise

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();

        int numOfFoods;

        System.out.print("Enter the number of foods you would like: ");
        numOfFoods = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFoods; i++)
        {
            System.out.print("Enter food number " + i +": ");
            String food = scanner.nextLine();
            foods.add(food); 
        }
        System.out.println("The list contains: "+ foods);

        scanner.close();
    }
}
