public class triangle extends shape{
    
    double base; 
    double height;
    triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }
    @Override
    double  Area()
    {
        return 0.5 *base * height;
    }
}
