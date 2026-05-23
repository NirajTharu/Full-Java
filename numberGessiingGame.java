import java.util.Random;
import java.util.Scanner;

public class numberGessiingGame {
   public static void main(String[] args) {
    
    // Number guessing game

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    
    int guess;
    int attempts = 0;
    
    int randomNumber = random.nextInt(1,101);
    System.out.println("Number Guessing game: ");
    System.out.println("Guess a number between 1 - 100: ");
    do{
      System.out.print("Enter a guess: ");
      guess = scanner.nextInt();
      attempts ++;
      if(guess<randomNumber)
      {
         System.out.println("Guess a higher number.");
      }
      else if(guess > randomNumber)
      {
         System.out.println("Guess a lower number.");
      }
      else {
         System.out.println("Correct the number was " + randomNumber);
         System.out.println("# of attempts: " + attempts);
      }

    }while(guess != randomNumber);
      scanner.close();
   } 
}
