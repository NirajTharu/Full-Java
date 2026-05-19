import java.util.Scanner;

public class shopingCart {
    public static void main(String[] args) {
        
        Scanner scanner  = new Scanner(System.in);

        String itemName; 
        double price;
        int quantitiy;
        char currency = '$';
        double total;

        System.out.print("What item you would like to buy?:");
        itemName = scanner.nextLine();

        System.out.print("What is the price for each?:");
        price =scanner.nextDouble();

        System.out.print("How may would you like to buy?:");
        quantitiy = scanner.nextInt();

        System.out.println("\nYou bought the item called: " + itemName);
        System.out.println("price for each is: "+ currency + price);
        System.out.println("The quantity you bought is: " + quantitiy);

        total = price* quantitiy;

        System.out.println("The total price of the items you bought is: "+ currency + total);
        scanner.close();
    }
    
}
