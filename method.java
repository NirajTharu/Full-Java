import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        
        // method: a block of reusable code that is executed when called()
        Scanner scanner = new Scanner(System.in);
        double number;
        String firstName,lastName;
        int age; 

        System.out.println("Enter a number: ");
        number = scanner.nextDouble();
        System.out.println("The square of the given number is: " +square(number));
        System.out.println("The cube of the number U entered is: " + cube(number));

        scanner.nextLine();
        System.out.println("Enter your firstName: ");
        firstName = scanner.nextLine();
        System.out.println("Enter your lastName: ");
        lastName = scanner.nextLine();
        System.out.println("Your full Name is: "+fullName(firstName, lastName));

        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        System.out.println(AgeCheck(age));

        if(AgeCheck(age))
        {
            System.out.println("You can enter this site.");
        }
        else
        {
            System.out.println("You cannot enter this website.");
        }
        
        scanner.close(); 
    }
    static double square(double number)
        {
            return number * number;
        }
    static double cube (double number)
    {
        return number * number * number;
    }
    static String fullName(String firstName,  String lastName)
    {
        return firstName +" "+ lastName;
    }
    static boolean AgeCheck(int age)
    {
        if(age >= 16)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
