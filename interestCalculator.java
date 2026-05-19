import java.util.Scanner;

public class interestCalculator {
    public static void main(String[] args) {
        // Compund interest calculator
        
        Scanner scanner = new Scanner(System.in);

        double principleAmount; 
        double rate;
        int timeCompounded; 
        int years;
        double amount;

        System.out.print("Enter the principle amount?: ");
        principleAmount = scanner.nextDouble();

        System.out.print("Enter the interest rate? in(%): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year?: ");
        timeCompounded = scanner.nextInt();

        System.out.print("Enter the number of years?: ");
        years = scanner.nextInt();

        amount = principleAmount * Math.pow(1+rate/timeCompounded,timeCompounded * years);

        System.out.printf("After %d years you will get %.3f.\n",years, amount);
        
        scanner.close();
    }
}
