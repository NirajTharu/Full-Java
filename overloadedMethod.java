public class overloadedMethod {
    public static void main(String[] args) {
        
        // Overloaded Method: method that share same name, but different parameter;
        // signature = name + parameter;
        
        System.out.println(add(3, 3));
        System.out.println(add(3,3,5));
    }
    static double add (double number1, double number2)
    {
        return number1 + number2;
    }
    static double add (double number1,double number2, double number3)
    {
        return number1 + number2 + number3;
    }
}
