public class TwoDArray {
    public static void main(String[] args) {

        // 2D array: An array where each element is an array
        // Useful for storing a matrix of data

        String[] names = {"Hayato", "Kelly","Maxim","DJ Alok","Chrono","Moco"};
        String[] skillNames = {"Drop the Beat","Time Turner","Master of All", "Hacker's Eye" };
        String[] petNames = {"kitty","falco","Detective Panda","Sprit fox"};

        String [][] FF ={names, skillNames,petNames};
        FF[0][0] = "Alvaro";
        
        for(String[] Game : FF)
        {
            for(String AboutFF : Game)
            {
                System.out.print(AboutFF + " ");
            }
            System.out.println();
        }
    }
}
