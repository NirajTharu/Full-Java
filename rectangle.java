public class rectangle extends shape{
    
    double length;
    double breadth;

    rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double  Area()
    {
        return length * breadth;
    }
}
 