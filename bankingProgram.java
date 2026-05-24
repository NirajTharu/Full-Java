import java.util.Scanner;

public class bankingProgram {
            
    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        // Banking program
        /* 1. Declare variables
           2. Display menu
           3. Get and process user choice
           4. Show balance()
           5. Deposite balance()
           6. Withdraw balance()
           7. Exit message 
        */

         double balance = 0;
         boolean isRunning = true;
         int choice;

         while (isRunning) 
            {
                System.out.println("***************");
                System.out.println("LAXMI CHIT FUND");
                System.out.println("***************");
                System.out.println("1.Show Balance");
                System.out.println("2.Deposite");
                System.out.println("3.Withdraw");
                System.out.println("4.Exti");
                System.out.println("***************");

                System.out.print("Enter your choice(1-4): ");
                choice = scanner.nextInt();

                switch (choice) 
                    {
                        case 1:
                            System.out.print("Your Balance is: ");
                            showBlance(balance);
                        break;
                        case 2:
                            balance += depositeBalance();
                        break;
                        case 3:
                            balance -=  withdrawBalance(balance);
                        break;
                        case 4:
                            System.out.println("You have exit form the program.");
                            isRunning = false;
                        break;
                        default:
                            System.out.println("invalid Choice");
                        break;
                    } 
            } 
            System.out.println("****************************");
            System.out.println("Thanks for choosing our bank");
            System.out.println("Have a good Day");
            System.out.println("****************************");
            
        scanner.close();    
         
    }
        static void showBlance(double balance)
        {
            System.out.printf("$%.2f\n",balance);
        }
        static double depositeBalance()
        {
            double amount; 
            System.out.print("Enter the amount you want to deposite: ");
            amount = scanner.nextDouble();

            if(amount < 0)
            {
                System.out.println("Amount can't be negative.");
                return 0;
            }
            else
            {
                return amount;
            }
        }
        static double withdrawBalance(double balance)
        {
            double amount;
            System.out.print("Enter the amount to be withdrawn: ");
            amount = scanner.nextDouble();

            if(amount > balance)
            {
                System.out.println("Insufficient fund.");
                return 0;
            }
            else if(amount < 0)
            {
                System.out.println("Amount can't be negative.");
                return 0;
            }
            else{
                return amount;
            }

        }
        
}
