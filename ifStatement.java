import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        
        // if Statement = performs a block of code if its condition is true
        int age;
        String name;
        boolean isStudent;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name?: ");
        name = scanner.nextLine();

        System.out.print("Enter your age?:");
        age = scanner.nextInt();

        System.out.println("Are you a student? (true/false) ");
        isStudent = scanner.nextBoolean();


        if(name.isEmpty())
        {
            System.out.println("You didn't enter your name.");
        }
        else {
            System.out.println("Welcome " + name);
        }

        if( age >= 16 )
        {
            System.out.println( name +" is eligible for driving licence!");
        }
        else if(age <= 0)
        {
            System.out.println("This is invalid Age!");
        }
        else{
            System.out.println( name +" is not eligible for the driving licence!");
        }

         if(isStudent)
        {
            System.out.println("You are a student.");
        }
        else{
            System.out.println("You are not student.");
        }

        scanner.close();
    }
    
}
