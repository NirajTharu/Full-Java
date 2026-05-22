import java.util.Scanner;

public class enhancedSwitch {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String day;
        System.out.println("Enter the name of the day?");
        day = scanner.nextLine();

        // Enhanced Switches = A replacement to many if else statements (java14 features)
        switch (day) {
            case "sunday","monday","tuesday","wednesday":  System.out.println("first for days of the week.");
                break;
            default:
                System.out.println("not first four days of the week.");
                break;
        }
        
        // switch (day) {
        //     case "sunday":
        //         {
        //             System.out.println("sunday"); 
        //         }
        //         break;
            
        //     case "Monday":
        //         {
        //             System.out.println("Monday");
        //         }
        //         break;
        //     case "Tuesday":
        //         {
        //             System.out.println("Tuesday");
        //         }
        //         break;
        //     case "Wednesday":
        //         {
        //             System.out.println("Wednesday");
        //         }
        //         break;

        //     case "Thrusday":
        //         {
        //             System.out.println("Thrusday");
        //         }
        //         break;

        //     case "Friday":
        //         {
        //             System.out.println("Friday");
        //         }
        //         break;

        //     case "Saturday":
        //         {
        //             System.out.println("Saturday");
        //         }
        //         break;

        //     default:
        //         {
        //             System.out.println("No match case found.");
        //         }
        //         break;
        // }
        scanner.close();
    }
}
