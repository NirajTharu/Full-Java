public class motercycle {
   
    // is connected to the toString.java
    String mfrs;
    String model;
    int year;
    String color;

    motercycle(String mfrs, String model, int year, String color )
    {
        this.mfrs = mfrs;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    @Override
    public String toString()
    {
        return this.color + " " + this.model + " " + this.year + " " + this.mfrs;
    }
}
