public class printfMethod {
   public static void main(String[] args) {
    
    // About the printf()
    // This method is used to format the output
    // %f[flags][width][.precision][specifier-character]

    String name = "Niraj";
    char firstLetter = 'N';
    int age = 22;
    double height = 5.5;
    boolean isStudent = true;

    // for the Specifier Character
    System.out.printf("Hello %s\n", name);
    System.out.printf("Your name starts with %c\n", firstLetter);
    System.out.printf("Your age is %d years old.\n", age);
    System.out.printf("Your height is %f.\n",height);
        if(isStudent)
            {
                System.out.printf("Your are a student: %b\n", isStudent);
            }
        else{
                System.out.printf("You are not a student: %b\n", isStudent);
            }
    System.out.printf("%s is %d years old.\n",name,age);

    // For the precision 
    // %.1f for 0.0
    // %.2f for 0.00 and so on 

    double price = 99.999;
    System.out.printf("The price of the product is: %.1f\n", price);

    double number = 11.111;
    System.out.printf("The number is: %.2f\n", number);

    // For the Flags
    // +  = ouput + 
    // ,  = comma grouping seperator
    // (  = negative number are inclosed in ()
    // space = display a  minus if negative, space if positive => This is used for align numbers 

    double number1 = 11111.111;
    System.out.printf("The number is %,.2f\n",number1);

    // Width
    int id1 = 1;
    int id2 = 23;
    int id3 = 456;
    int id4 = 7890;

    // Padd the item with '0' four times
    // 0 = Zero padding

    System.out.printf("%04d\n",id1);
    System.out.printf("%04d\n",id2);
    System.out.printf("%04d\n",id3);
    System.out.printf("%04d\n",id4);

    // number = right justified padding
    System.out.printf("%4d\n",id1);
    System.out.printf("%4d\n",id2);
    System.out.printf("%4d\n",id3);
    System.out.printf("%4d\n",id4);
    
    // negative number = left justified padding
    System.out.printf("%-4d\n",id1);
    System.out.printf("%-4d\n",id2);
    System.out.printf("%-4d\n",id3);
    System.out.printf("%-4d\n",id4);
   } 
}