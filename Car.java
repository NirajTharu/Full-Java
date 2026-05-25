public class Car {
    
    String make = "Ford"; 
    String model = "Mustang";
    int year = 2025;
    double price = 5500.99;
    boolean isRunning = false;

    void start()
    {
        isRunning = true;
        System.out.println("You have start the engine.");
    }
    void stop()
    {
        isRunning = false;
        System.out.println("You have stop the engine.");
    }
    void drive()
    {
        System.out.println("You drive the " + model);
    }
    void Break()
    {
        System.out.println("You break the "+ model);
    }
}
