public class breakAndContinue {
    public static void main(String[] args) {
        
        // break : break out of a loop
        // continue : skip a current iteration of a loop (skip)

            System.out.println("This one is for brek: ");
            for(int i =0;i<5;i++)
            {
                if(i == 2)
                {
                    break;
                }
                System.out.println(i);
            }

            System.out.println("This one is for coninue: ");
            for(int i = 0; i<10 ;i++)
            {
                if(i == 5)
                {
                    continue;
                }
                System.out.println(i);
            }
    }
}
