import java.util.Scanner;

public class logicalOperaorts {
    public static void main(String[] args) {
        // && logical and
        // || logical or 
        // !  logical not

        Scanner scanner = new Scanner(System.in);
        // User name must be between  4-12 characters
        // User name must not contain spaces or underscores
        
        String userName;

        System.out.print("Enter your user name: ");
        userName = scanner.nextLine();

        if(userName.length() < 4 || userName.length() > 12)
        {
            System.out.println("User name must be between 4 to 12 characters.");
        }
        else if(userName.contains(" ") || userName.contains("_"))
        {
            System.out.println("User name must not conatin spaces of underScore.");
        }
        else {
            System.out.println("Welcome " + userName);
        }

        scanner.close();
    }
}
