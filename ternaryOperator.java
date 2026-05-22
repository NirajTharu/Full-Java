public class ternaryOperator {
    public static void main(String[] args) {
        
        // TERANARY OPERATOR 
        // ternaryOperator? = return one two variables if the condition is true 
        // variable = (condition)? ifTrue: iffalse
        
        int score = 55;
        String passOrFail = (score >= 40)? "pass" : "fail";
        System.out.println(passOrFail);

        // Even or odd
        int number = 21;
        String OddOrEven = number % 2 == 0? "even" : "odd";
        System.out.println(OddOrEven);

        int hours = 11;
        String  timeOfDay = (hours > 12)? "P.M." : "A.M.";
        System.out.println(timeOfDay);

        int income = 50000;
        double taxRate = (income >= 40000)? 0.25 : 0.15;
        System.out.println(taxRate);
    }
}