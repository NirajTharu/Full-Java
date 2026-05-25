public class staticKeyWord {
    public static void main(String[] args) {
        // Connected to friends.java

        // About static Key word:  Makes a variable or method belongs to the class rather than to any specific object.
        // Commonly used for utility methods or shared resources.

        // friends friend1 = new friends("Nikita");
        // friends friend2 = new friends("Alvaro");
        // friends friend3 = new friends("Hayato");
        // friends friend4 = new friends("Kelly");
        // friends friend5 = new friends("Maxim ");

        // System.out.println(friends.numOfFriends);


        friends[] friendsList = 
        {   new friends("Nikita"),
            new friends( "alvaro"),
            new friends("Hayato"),
            new friends("Kelly"),
            new friends("Maxim")
        };
        friends.showFriends();  
    }
}
