// variables: A reusable container for a value. A variables behaves as if it was the value of a container

// Primitive: simple value directly stored in the memory(stack)
// Reference: memory address(stack) that points to the (heap)

// Primitive                    vs      Refrence
// int, double, char boolean            String, Array, Object

// Steps in creating a variable:
// 1. Declaration
// 2. Assignment

public class variables {
    public static void main(String[] args) {
        
        // 1. Primitive Data type

        // Integer
        int age = 22;
        System.out.println("My age is: " + age);

        // Double : Numbers that contains decimal portion
        double GPA = 3.3;
        System.out.println("My GPA is: "+GPA);

        // char
        char grade = 'A';
        System.out.println("My grade is: " + grade);

        // boolean
        boolean isStudent = true;
        boolean isOnline = true;
        System.out.println("I am a student. " + isStudent);
        System.out.println(".... is online. " +isOnline);

        if(isOnline)
        {
            System.out.println("Text him/her.");
        }
        else{
            System.out.println("Don't text her/him now.");
        }

        // Refrence Data type

        // String : series of characters
        String fullName = "Niraj Kumar Chaudhary.";
        System.out.println("My full Name is: " + fullName);
    }
    
}
