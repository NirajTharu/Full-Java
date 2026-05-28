import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dateAndTime {
    public static void main(String[] args) {
        
        // Working with Date and Time in Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalDate localDate = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        System.out.println(instant);

        System.out.println(time);
        System.out.println(localDate);
        System.out.println(dateTime);

        // Custom Format for Date and time 
        DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        // Custom Date
        LocalDate birthDay = LocalDate.of(2004, 8, 19);
        System.out.println(birthDay);

        // Custom Date and time
        LocalDateTime dateTimeNow = LocalDateTime.of(2082,3,14,5,26,00);
        System.out.println(dateTimeNow);
        
        // Two date comparision

        LocalDateTime date1 = LocalDateTime.of(2022,12,1,11,12,33);
        LocalDateTime date2 = LocalDateTime.of(2020,1,2,11,22,8);

        if(date1.isBefore(date2))
        {
            System.out.println(date1 + " is earlier than " + date2);
        }
        else if(date1.isAfter(date2))
        {
            System.out.println(date2 + " is earlier than " + date1);
        }
        else if(date1.isEqual(date2))
        {
            System.out.println(date1 +" is equal to " +date2);
        }

     }
}
 