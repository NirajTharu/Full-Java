import java.util.Scanner;

public class searchAnElementInArray {
    public static void main(String[] args) {
        
        // Search an element in the array
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1,4,3,2,5,8,9,10,7,6};
        boolean isFound = false;
        int target; 
        
        System.out.print("Enter the target numbber you want to find (1-10): ");
        target = scanner.nextInt();
        
        // To clean up the buffer
        scanner.nextLine();

        for(int i = 0; i < numbers.length; i++)
        {
            if(target == numbers[i])
            {
                System.out.println("Element is found at index: " + i );
                isFound = true;
                break;
            }
        }
        if(!isFound)
        {
            System.out.println("Element is not found in the array.");
        }

        String [] names = {"Nikita", "joseph","Hayato", "Kelly","Maxim"};
        String toFind;
        boolean wasSeen = false;

        System.out.println("Enter the name of FreeFire Character you want to find: ");
        toFind = scanner.nextLine();
        for(int i = 0; i < names.length; i++)
        {
            if(names[i].equals(toFind))
            {
                System.out.println("Name was found at the index of " + i);
                wasSeen = true;
                break;
            }
        }
        if(!wasSeen)
        {
            System.out.println("Name was not in the list.");
        }
        scanner.close();
    }
}
