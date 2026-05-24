import java.util.Scanner;

public class quizGame {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        // Quiz Game of FF

        //1. Question Array[]
        String [] questions = 
        {
            "Which character is a world-famous DJ who creates an aura that increases movement speed and restores HP?",
            "Which weapon category does the \"M1887\" belong to?",
            "Which pet gives you extra Gloo Wall grenades over time if you don't have any in your inventory?",
            "Which character is known as a professional martial artist whose ability \"Sustained Raids\" restores HP instantly upon knocking down an enemy?",
            "According to Garena’s official lore, which character is Kelly’s adoptive father?",
            "Which tactical item allows you to reveal the locations of nearby enemies within a specific radius on your minimap for a few seconds?",
            "Which awaken character contains the \"Firebrand\" in his/her name?" 
        };
        //2. Options[][]
        String [][] options = 
        {
            {
                "1. K",
                "2. DJ Alok",
                "3. Steffie",
                "4. Crono"
            },
            {
                "1. Assault Rifle",
                "2. Sniper Rifle",
                "3. Submachine Gun",
                "4. ShotGun"
            },
            {
                "1. Rockie",
                "2. Robo",
                "3. Mr. Waggor",
                "4. Falco"
            },
            {
                "1. Kla ",
                "2. Hayato",
                "3. Jota",
                "4. Tatsuya"
            },
            {
                "1. Maxim",
                "2. Hayato",
                "3. Andrew",
                "4. Ford"
            },
            {
                "1. UAV-Lite",
                "2. Smoke Grenade",
                "3. Flashbang",
                "4. Decoy Grandae"
            },
            {
                "1. Kelly",
                "2. Hayato",
                "3. Andrew",
                "4. Moco"
            }
        };
        
        //3. Declare Variables
        int [] answers = {2,4,3,3,3,1,2};
        int score = 0;
        int guess; 


        //4. Welcome Message
        System.out.println("*********************************");
        System.out.println("Welcome to the Freefire Quiz Game");
        System.out.println("*********************************");


        for(int i = 0; i < questions.length; i++)
        {
            //5. Question (loop)
            System.out.println(questions[i]);
            //6. Options
            for(String option : options[i])
            {
                System.out.println(option);
            }
                    
            //7. Get guesses from users
            System.out.print ("Enter your guess(1-4):");
            guess = scanner.nextInt();

            //8. Check our guess
            if(guess == answers[i])
            {
                System.out.println("*******");
                System.out.println("CORRECT");
                System.out.println("*******");
                score++;
            }
            else
            {
                System.out.println("*******");
                System.out.println("WRONG");
                System.out.println("*******");
            }
        }

        //9. Display final score
        System.out.println("Your final score is "+ score +" out of " + questions.length);
        scanner.close();
        
    }
}
