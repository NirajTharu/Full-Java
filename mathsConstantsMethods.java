// For the user input
import java.util.Scanner;

public class mathsConstantsMethods {
    public static void main(String[] args) {

        // For the input 
        Scanner scanner = new Scanner(System.in);
         
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;
        // This one is 3 to the power 2
        result = Math.pow(3,2);
        System.out.println(result);

        // absolute: means always positive
        int number = -2;
        number = Math.abs(number);
        System.out.println("The absolute value is: " + number);

        // for the Squre root the data type is double for no data loss.
        double squrt = Math.sqrt(2);
        System.out.println("The square root of the given number is: "+squrt);

        // round 
        double round = Math.round(3.4);
        System.out.println("The round value is: "+round);

        // round ceil
        double  round1 = Math.ceil(3.3);
        System.out.println("The round ceil value is: "+round1);

        // round floor
        double round2 = Math.floor(3.99);
        System.out.println("The round floor value is: " + round2);

        // max between two
        double max = Math.max(round1,round2);
        System.out.println("The max value is: "+max);

        // min between two
        double min = Math.min(round1, round2);
        System.out.println("The min value is: "+min);

        // 1. Exercise of Hypotenuse
        // c = sqrt a^2 + b^2
         
        double a; 
        double b;
        double c;

        System.out.println("Enter the length of side a: ");
        a = scanner.nextDouble();
        System.out.println("Enter the length of side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("The hypotenuse (side c) is: " + c +" cm");

        // 2.Exercise : To find the circumfrence , Area, Volume of the circle while the radius is given.
        // circumfrence = 2 * PI * radius;
        // Area = PI * radius * radius;
        // Volume = 4/3 * PI * radius ^3;

        double radius; 
        System.out.print("Enter the radius of the circle?: ");
        radius = scanner.nextDouble();

        double circumfrence = 2 * Math.PI * radius;
        System.out.println("The Circumfrence of the circle is: " + circumfrence + " unit");

        double area = Math.PI * Math.pow(radius,2);
        // printf %.1f for one digit after the decimal 
        System.out.printf("The area of the cirlce is: %.1f cm^2" , area);

        double volume = 4/3*(Math.PI * Math.pow(radius,3));
        System.out.printf("\nThe volume of the circle is: %.2f cm^3 \n" , volume  );

        scanner.close();
    }
}
