import java.util.Random;
import java.util.Scanner;

public class slotMachine {
    public static void main(String[] args) {
        
        // Slot Machine
        Scanner scanner = new Scanner(System.in);

        // Declare our varibales
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;
         
        // Display Welcome message
        System.out.println("*************************");
        System.out.println("Welcome to the slot Game:");
        System.out.println("Symbols: ⛈  ☁  ☀  ☽  ☾  ");
        System.out.println("*************************");

        // Play if balance > 0
        while(balance > 0)
        {
            System.out.println("\nCurrent Balance is: $"+ balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine(); 

            if(bet > balance)
            {
                System.out.println("Insufficient fund.");
                continue;
            }
            else if(bet <= 0)
            {
                System.out.println("Bet amount must be positive.");
                continue; 
            }
            else{
                    balance -= bet;
                }
                System.out.println("Spinning...");
                System.out.println();
                row = spinRow();
                printRow(row);
                payout = getPayout(row, bet);

                if(payout > 0)
                {
                    System.out.println("You won $: "+ payout);
                    balance += payout;
                }
                else{
                    System.out.println("You lost this round");
                }
                System.out.print("Do you want to play again?(Y/N): ");
                playAgain = scanner.nextLine().toUpperCase();

                if(!playAgain.equals("Y"))
                {
                    break; 
                }
        }
        // User is going to enter the amount
        /* Enter bet amount 
                verify if bet > balance
                verify if bet > 0
                Subtract bet from our balance
        */
        // Spin row
        // Print row
        // Get payout
        // Ask to play again
        // Display exit message  

        System.out.println("GAME OVER! Your final blance is: $"+ balance);
        scanner.close();    
    }
    static String[] spinRow()
    {
        String [] Symbols = {"⛈" , "☁" , "☀" , "☽" , "☾"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++)
        {
            row[i] = Symbols[random.nextInt(Symbols.length)];
        }
        return row;
    }

    static void printRow(String [] row)
    {
        System.out.println("************************************");
        System.out.println(" " + String.join(" |  ", row));
        System.out.println("************************************");  
    }    
    static int getPayout(String[] row, int bet)
    {
        if(row[0].equals(row[1]) && row[1].equals(row[2]) )
        return switch(row[0])
        {
            case "⛈" -> bet * 3;
            case "☁" -> bet * 4;
            case "☀" -> bet * 5;
            case "☽" -> bet * 10;
            case "☾" -> bet * 20;
            default -> 0;
        };

        else if(row[0].equals(row[1]))
        return switch(row[1])
        {
            case "⛈" -> bet * 2;
            case "☁" -> bet * 3;
            case "☀" -> bet * 4;
            case "☽" -> bet * 5;
            case "☾" -> bet * 10;
            default -> 0;
        };
        else if(row[1].equals(row[2]))
        return switch(row[1])
        {
            case "⛈" -> bet * 2;
            case "☁" -> bet * 3;
            case "☀" -> bet * 4;
            case "☽" -> bet * 5;
            case "☾" -> bet * 10;
            default -> 0;
        };
        return 0; 
    }
}
