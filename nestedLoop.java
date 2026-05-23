import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args) {
        
        // Nested Loop : A loop inside another loop widely used with matrices and DSA.
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i<=3; i++)
        {
            System.out.println("This one is i iteration."+ i);
            for(int j = 0;j<= 5;j++)
            {
                System.out.print(j);
                System.out.println();
            }
        }

        // For the matrix formation
        int row; 
        int column;
        char charSymbol;
        System.out.print("Enter the number of row: ");
        row = scanner.nextInt();
        System.out.print("Enter the number of column: ");
        column = scanner.nextInt();
        System.out.print("Enter the symbol of which you want to make matrix: ");
        charSymbol = scanner.next().charAt(0);

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                System.out.print(charSymbol);
            }
            System.out.println();
        }
        scanner.close();
    }
}
