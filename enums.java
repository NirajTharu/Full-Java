import java.util.Scanner;

public class enums {
    public static void main(String[] args) {
        
        // Enums = (Enumerations) A speical kinds of class that represents a fixed set of constants.
        // It improves the code readablity and are easy to maintain.
        // More efficient with switches when comparing strings
         
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();
        
        
     
        try{
            days day = days.valueOf(response);
            switch (day) 
                {
                    case SUNDAY -> System.out.println("First day of the week.");
                    case MONDAY -> System.out.println("Second day of the week.");
                    case TUESDAY -> System.out.println("Third day of the week.");
                    case WEDNESDAY -> System.out.println("Fourth day of the week.");
                    case THRUSDAY -> System.out.println("Fifth day of the week.");
                    case FRIDAY -> System.out.println("Sixth day of the week.");
                    case SATURDAY -> System.out.println("Last day of the week.");
                    // default: System.out.println("Does not belongs to the seven days in a week.");
                } 
        } 
        catch(IllegalArgumentException e){
            System.out.println("Please enter the valid day of the week. ");
        }
        scanner.close();
    }
}
