public class variablesArguments {
    public static void main(String[] args) {
        
        // varargs: allow a method to accept a varying number of elements,
        // makes method more flexible no need for overloaded methods
        // Java will pack the arguments into an array
        // ... (ellipsis)
        
        System.out.println("The sum of given numbers is: "+add());
        System.out.println("The average of the given numbers is: "+average());
    }
    static double add(double... numbers)
    {
        double sum = 0;
        if(numbers.length == 0)
        {
            return 0;
        }
        for(double num:numbers)
        {
            sum += num;
        }
        return sum;
    }
    static double average(double... numbers)
    {
        double average = 0;
        if(numbers.length == 0)
        {
            return 0;
        }
        for(double i:numbers)
        {
            average += i;
        }
        return average = average/numbers.length;
    }
}
