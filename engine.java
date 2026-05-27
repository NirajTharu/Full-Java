public class engine {
    
    String type;

    engine(String type)
    {
        this.type = type;
    }
    void start()
    {
        System.out.println("You start the " +this.type + " engine.");
    }
}
