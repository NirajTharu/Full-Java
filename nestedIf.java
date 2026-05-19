public class nestedIf {
    public static void main(String[] args) {
        
        boolean isStudent = false;
        boolean isSenior = true;
        
        double price = 22.22;

        if(isStudent)
            {
                if(isSenior)
                {
                    System.out.println("You will get a senior Discount of 20%");
                    System.out.println("You get a student discount of 10%");

                    price *= 0.7;
                }else{
                    System.out.println("You get a student discount of 10%");
                    price *= 0.9;
                }
            }
        else{
            if(isSenior)
            {
                System.out.println("You will get a senior Discount of 20%");
                price *= 0.7;
            }
            else{
                price *=1;
            }
        }
        System.out.printf("The price of the ticket is: %.2f\n",price);
    }
}
