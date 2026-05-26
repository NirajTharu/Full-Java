public class toString {
    
    // is conncected to the motercycle.java
    public static void main(String[] args) {

        // .toString(): Method inherited from the Object class. 
        // Used to return a string repersentation of an object. 
        // By default, it returns a hash code as a uinque identifier.It can be overridden to provide meaningful details.
        
        motercycle motercycle1 = new motercycle("Yamaha", "MT-15 V2", 2025, "black");
        motercycle motercycle2 = new motercycle("Honda", "XR109LS", 2024, "red");

        System.out.println(motercycle1);
        System.out.println(motercycle2);

    }
}
