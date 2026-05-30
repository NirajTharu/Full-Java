import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlaramClock {
    public static void main(String[] args) {
        
        // Alram Clock
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "Love_me_thoda.wav";
         
        while(alarmTime == null)
        {
            try{
                    System.out.print("What is the time you want to ring alram(HH:mm:ss): ");
                    String inputTime = scanner.nextLine();

                    alarmTime = LocalTime.parse(inputTime, formatter);
                    System.out.println("Alram set for: "+ alarmTime);
            }
            catch(DateTimeParseException e)
                {
                    System.out.println("Invalid format. Please use HH:mm:ss");
                }
        }

        setAlarm setAlarm = new setAlarm(alarmTime,filePath,scanner);
        Thread alramThread = new Thread(setAlarm);
        alramThread.start();
        
    }
}