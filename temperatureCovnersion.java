import java.util.Scanner;

public class temperatureCovnersion {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double temperature; 
        double newTemperature;
        String unit;
        System.out.print("Enter the temperature:");
        temperature = scanner.nextDouble();
        
        System.out.print("Convert to celsius or fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        // (condition)? true : false; 
        newTemperature = (unit.equals("C"))?(temperature - 32) * 5/9:(temperature * 5 / 9) +32;
        System.out.printf("%.2f° %s\n", newTemperature , unit);
     
        scanner.close();
    }
}
