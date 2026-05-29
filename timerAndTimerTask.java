import java.util.TimerTask;
import java.util.Timer;

public class timerAndTimerTask {

    public static void main(String[] args) {
        
        // Timer: Class that schedules specific times or periodically Useful for: notifications, scheduled updates, repetitive actions
        // Timer Task: Represents the taks that will be executed by the Timer, You will extend the Timer taks calss to define your task 
        // Create a subclass of the timer task and @Override run()


        Timer timer = new Timer();
        TimerTask task = new TimerTask()
        {
            int count = 3;
            @Override
            public void run()
            {
                System.out.println("Hi there");
                count --;
                if(count <= 0)
                {
                    System.out.println("Task Complted.");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task,3000,1000);

    }
}