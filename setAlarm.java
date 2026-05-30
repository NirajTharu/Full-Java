import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class setAlarm implements Runnable{
    
    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    setAlarm(LocalTime alarmTime,String filePath,Scanner scanner)
    {
       this.alarmTime = alarmTime;
       this.filePath = filePath;  
       this.scanner = scanner;
    }
    @Override
    public void run()
    {
        while(LocalTime.now().isBefore(alarmTime))
        {
            try{
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();
                System.out.printf("\r%02d:%02d:%02d",now.getHour(),now.getMinute(),now.getSecond());
            }catch(InterruptedException e)
            {
                System.out.println("Thread was interrupted.");
            }
        }
        System.out.println("\n**Alram noises**");
        playSound(filePath );
    }
    private void playSound(String filePath)
    {
        File audioFile = new File(filePath);

        try(AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile))
        {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            System.out.println("Press enter to stop alram.");
            scanner.nextLine();
            clip.stop();
            scanner.close();

        }catch(UnsupportedAudioFileException e)
        {
            System.out.println("Audoi file format is not suppported.");
        }catch(LineUnavailableException e)
        {
            System.out.println("Audio unavailable.");
        }
        catch(IOException e)
        {
            System.out.println("Error reading audio file. ");
        }
    }
}
