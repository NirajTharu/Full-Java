// For taking the input for the user
import java.util.Scanner;

public class rectangleArea {
    public static void main(String[] args) {
        // Calculate the area of a rectangle

        double length = 0;
        double breadth = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of rectangle:");
        length = scanner.nextDouble();
        System.out.print("Enter the breadth of rectagle: ");
        breadth = scanner.nextDouble();

        area = length * breadth;
        System.out.println("The area of the rectable is: " + area +" cm²");

        scanner.close();
    }
}
