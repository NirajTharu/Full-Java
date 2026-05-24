public class variableScope {
    static int x = 3; //Class vairable
    public static void main(String[] args) {
        
        // Variable  Scope: Where a variable can be accessed.

        // First priority is to the local variables and then the class variables
        int x = 1; //Local Variable
        System.out.println(x);
        doSomething();
    }
    static void  doSomething()
    {
        int x = 2;// Local Variable
        System.out.println(x );
    }
}
