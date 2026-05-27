public class forest {
    
    private String treesName;
    private int treesNumber;
    private final boolean isAlive;

    forest(String treesName, int treesNumber, boolean isAlive)
    {
        this.treesName = treesName;
        this.treesNumber = treesNumber;
        this.isAlive = isAlive;
    }

    // Getter
    String gettreesName()
    {
        return this.treesName;
    }
    int gettreesNumber()
    {
        return this.treesNumber;
    }
    boolean getisAlive()
    {
        return this.isAlive;
    }

    // Setter
    void settreesName(String treesName)
    {
        this.treesName = treesName;
    }
    void settreesNumber(int treesNumber)
    {
        this.treesNumber = treesNumber;
        
        if(treesNumber <= 1000)
        {
            System.out.println("You need to plant more tress of "+ this.treesName + " and has only tress of "+this.treesNumber);
        }
        else{
            System.out.println("The number of " + this.treesName + "tree is  ok." +" It has the number of "+ this.treesNumber); 
            System.out.println("But you should plant more " + this.treesName + " And cross the number of 5000");
        }
    }


}
