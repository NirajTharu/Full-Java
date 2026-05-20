import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // substring(): a method used to extract a portion of string.
        // string.substring(start,end);
        String email;
        System.out.print("Enter your email?: ");
        email = scanner.nextLine();
        if(email.contains("@"))
        {
            String username = email.substring(0,email.indexOf("@"));
            System.out.println("Your user name is: " + username);

            String domain = email.substring(email.indexOf("@"));
            System.out.println("The domin is: "+domain);   
        }else{
            System.out.println("email must contain: '@'.");
        }
        scanner.close();
    }
}
