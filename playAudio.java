import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.AudioInputStream;         
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

public class playAudio {
    public static void main(String[] args) {
        
        //  How to play a audio using the java. 
        // Compatilble file format(.wav, .au, .aiff)


        String filePath = "Love_me_thoda.wav";

        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in);AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip(); 
            clip.open(audioStream);
            
            String response = "";

            while(!response.equals("Q"))
            {
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");

                System.out.print("Enter your choice: ");
                response = scanner.nextLine().toUpperCase();

                switch (response) {
                    case "P":
                        clip.start();   
                        break;
                
                    case "S":
                        clip.stop();
                        break;
                    case "R":
                        clip.setMicrosecondPosition(0); 
                        break;
                    case "Q":
                        clip.close();
                        break;
                    default:
                        System.out.println("Invalid option was choosen.");
                        break;
                }
            }

        }
        catch(FileNotFoundException e)
        {
            System.out.println("Could not locate file.");
        }
        catch(UnsupportedAudioFileException e)
        {
            System.out.println("File type is not supported.");
        }
        catch(LineUnavailableException e)
        {
            System.out.println("Unable to access the audio resource.");
        }
        catch(IOException e)
        {
            System.out.println("Some thing went wrong.");
        }
        finally
        {
            System.out.println("The program is closed.");
        }

    }
}