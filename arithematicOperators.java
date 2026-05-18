public class arithematicOperators {
    public static void main(String[] args) {
        
        // ======= Arithematic Operators
        int firstNum = 10;
        int secondNum = 22;

        // Addition sign(+)
        int sum = firstNum + secondNum;
        System.out.println("The sum of two umbers is: "+sum);

        // Subtraction sign(-)
        int difference = secondNum - firstNum;
        System.out.println("The diffrence of two number is: "+ difference);

        // Multiplication sign(*)
        int product = firstNum * secondNum;
        System.out.println("The product of two number is: " + product);

        // Division sign(/)
        int quotient = secondNum/firstNum;
        System.out.println( "The quotient is: "+quotient);

        // Modulus sign(%)
        int remainder = secondNum % firstNum;
        System.out.println("The remainder is: "+ remainder);

        // Agumented Assignment Operator
        System.out.println("\nThis is done using augumented Operators:");
        int number3 = 16;
        int number4 = 4;


        // ======= This is same as number3 = number3 + number4;
        number3 += number4;
        System.out.println("The sum is: " +number3);

        number3 -= number4;
        System.out.println("The difference is: " + number3);

        number3 *= number4;
        System.out.println("The product is: "+ number3);

        number4 /= number3;
        System.out.println("The quotient is: "+ number4);

        number4 %= number3;
        System.out.println("The remainder is "+ number4);


        // ====== Increment and Decrement Operator
        int number5 = 7;
        number5++;
        System.out.println("The value is " +number5);

        number5--;
        System.out.println("The value is " + number5);

        // ===== ORDER OF THE OPERATORS(P-E-M-D-A-S)
        double result = 3 + 4 * (4 - 3) / 2.2;
        System.out.println("\nThe result of the expression is: "+ result);
    }
}
