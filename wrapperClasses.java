public class wrapperClasses {
    public static void main(String[] args) {
        
        // WrapperClasses
        // Allows primitive values(int, char, bouble, boolean) to be used as objects. "Wrap them in an object" Generally don't wrap them in object
        // Allows use of Collections Framework and static Utility methods

        // This technique is called autoboxing
        Integer a = 123;
        Double b = 2.22;
        Character c = '$';
        Boolean d = true;
        String e = "Popular";

        // This is unboxing
        int x = a;
        double y = b;
        char z = c;
        boolean f = d;
        String g = e;

        System.out.println("The value of x, y, z, f, g are listed below: "+  x +" "+ y +" "+ z +" "+ f + " "+ g);

        // A way to convert primitive data type to String
        String numberOfApple = Integer.toString(111);
        String amountOfMoney = Double.toString(222.222);
        String symbolOfDollar = Character.toString('$');
        String isAGoodBoy = Boolean.toString(true);

        String added = numberOfApple + amountOfMoney + symbolOfDollar + isAGoodBoy;

        System.out.println(added);

        System.out.println(numberOfApple + " " + amountOfMoney + " " + symbolOfDollar + " " + isAGoodBoy);


        // A way to convert String to a primitive data type
        int noOfStudent = Integer.parseInt("1111");
        double noOfMoles = Double.parseDouble("11.11");
        char firstCharOfEnglighAlpabet = "ABCD".charAt(0);
        boolean isOk = Boolean.parseBoolean("ture");
        
        System.out.println("The total no of student is: "+noOfStudent);
        System.out.println("The no of Moles is: "+noOfMoles);
        System.out.println("The first character of english alphabet is: "+firstCharOfEnglighAlpabet);
        System.out.println("Is is ok: "+isOk);

        // Letter wrapper class
        char letter = 'A';
        System.out.println(Character.isLetter((letter)));
        System.out.println(Character.isLowerCase(letter));
        System.out.println(Character.isUpperCase(letter));
        
    }
    
}
