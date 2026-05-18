import java.util.Scanner;

public class userInupt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // println is used to take/give input/output in the new line
        // print is used to take/give input/output in the same line

        System.out.print("Enter your Name: ");
        // To read a stirng .nextLine() is used
        String name = scanner.nextLine();
        System.out.println("Welcome " + name);

        // To read a integer .nextInt() is used
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are "+age+" years old.");

        // To read a double .nextDobule() is used
        System.out.print("Enter your GPA: ");
        double GPA = scanner.nextDouble();
        System.out.println("Your GPA is: " + GPA);

        // To read a boolean .next
        System.out.println("Are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();
        if(isStudent)
        {
            System.out.println("You will get discount.");
        }
        else{
            System.out.println("You should pay full price.");
        }

        //Common issue: When you first take a input as number or double and then string there arises problem so to solve that just use sccanner.nextLine()
        scanner.close();
    }
}
