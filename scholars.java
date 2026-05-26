public class scholars extends person {
    
    // This is conected to the person.java
    double gpa;

    scholars(String firstName, String lastName, double gpa){
        super(firstName,lastName);
        this.gpa = gpa;
    } 
    void showGPA()
    {
        System.out.println("GPA of "+ this.firstName + " "+ this.lastName + " is: " + this.gpa);   
    }
}
 