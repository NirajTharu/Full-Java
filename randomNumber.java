// For working with random number
import java.util.Random;

public class randomNumber {
    public static void main(String[] args) {
        
        Random random = new Random();

        // For integers
        int number, diceFace, dice1Face,dice2Face,dice3Face;
        // The range is of -2 billion to 2 billion
        number = random.nextInt ();
        System.out.println(number);

        // first number is inclusive where as the second number is exclusive
        diceFace = random.nextInt(1,7);
        System.out.println("You got " + diceFace);
        
        // Rolling three dice at once
        dice1Face = random.nextInt(1,7);
        dice2Face = random.nextInt(1,7);
        dice3Face = random.nextInt(1,7);

        System.out.println("You got " + dice1Face + " in first dice");
        System.out.println("You got " + dice2Face + " in second dice");
        System.out.println("You got " + dice3Face + " in thrid dice");

        // For double
        // This will generate the value between 0 and 1.
        double floatNumber = random.nextDouble();
        System.out.println("The floating point number is: "+floatNumber);

        // For boolean 
        // This will generate true / false 
        boolean forSale = random.nextBoolean();
        System.out.println("The product is for sale: " + forSale);

        if(forSale)
        {
            System.out.println("You can buy this product.");
        }
        else{
            System.out.println("You can't buy this product.");
        }
    }
}
