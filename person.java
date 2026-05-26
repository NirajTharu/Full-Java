public class person {
    
    // connected to the superKeyWord.java
    String firstName;
    String lastName;

    person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    void showName()
    {
        System.out.println(this.firstName + " " + this.lastName);
    }
}
