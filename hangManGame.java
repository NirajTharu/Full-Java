import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hangManGame {
    public static void main(String[] args) {
        
        // HUMGMAN IN JAVA
        String filePath = "words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            while((line = reader.readLine()) !=  null)
            {
                if(!line.trim().isEmpty())
                {
                    words.add(line.trim().toLowerCase());
                }
            }

        }catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
        catch(IOException e)
        {
            System.out.println("Something went wrong.");
        }

        if(words.isEmpty())
        {
            System.out.println("No words found in the file.");
            return;
        }
        
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);
        int wrongGuesses = 0;
        boolean isWon = false;
        char guess; 

        ArrayList <Character> wordState = new ArrayList<>();
        for(int i = 0; i < word.length(); i++)
        {
            wordState.add('_');
        }
        
        System.out.println("***********************");
        System.out.println("Welcome to HangMan Game");
        System.out.println("***********************");
        
        while(wrongGuesses < 6 && !isWon)
        {
            System.out.println(getHangManArt(wrongGuesses));
            System.out.print("Word: ");

            for(char c:wordState)
                {
                    System.out.print (c + " ");
                }
            System.out.println();

            System.out.print("Guess a letter: ");
            guess = scanner.next().toLowerCase().charAt(0);
            System.out.println(guess);

            if(word.indexOf(guess) >= 0)
                {
                    System.out.println("CORRECT Guess.\n");
                    for(int i = 0; i < word.length(); i++)
                    {
                        if(word.charAt(i) == guess)
                        {
                            wordState.set(i,guess);
                        }
                    }

                    if(!wordState.contains('_'))
                    {
                        isWon = true;
                        System.out.println(getHangManArt(wrongGuesses));
                        System.out.println("You have won the game.");
                        System.out.println("The word was: " + word);
                    }

                }
            else
                {
                    wrongGuesses ++;
                    System.out.println("Wrong Guess.");
                }
        }
        if(wrongGuesses >= 6)
        {
            System.out.println(getHangManArt(wrongGuesses));
            System.out.println("Game Over.");
            System.out.println("The word was " + word);
        }
        scanner.close();
    }

    static String getHangManArt(int wrongGuesses)
    {
        return switch(wrongGuesses){
            case 0 -> 
                    """
                     


                    """;
            case 1 -> 
                    """
                     o
                     
            
                    """;

            case 2 -> 
                    """
                     o
                     |
            
                    """;
            case 3 -> 
                    """
                     o
                    /|
            
                    """;
            case 4 -> 
                    """
                     o
                    /|\\
            
                    """;
            case 5 -> 
                    """
                     o
                    /|\\
                    /
                    """; 
            case 6 -> 
                    """
                     o
                    /|\\
                    / \\
                    """; 
            default -> "";
        };
    }
}
