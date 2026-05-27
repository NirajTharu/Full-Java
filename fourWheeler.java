public class fourWheeler {
    
    String model;
    int year;
    engine engine;

    fourWheeler(String model, int year,String engineType)
    {
        this.model = model;
        this.year = year;
        this.engine = new engine(engineType); 
    }

    void start()
    {
        this.engine.start();
        System.out.println("The " + this.model + " is running.");
    }
}
