public class friends {
    
    // Connected to staticKeyWord.java
    
    static int numOfFriends;
    String name;

    friends (String name)
    {
        this.name = name;
        numOfFriends++;
    }
    static void showFriends()
    {
        System.out.println("You have " + numOfFriends +  " total friends: ");
    }
}
