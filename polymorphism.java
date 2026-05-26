public class polymorphism {
   public static void main(String[] args) {
    
    // POLY = "Many"
    // MORPHISM = "Shape"
    // Objects can identify as other objects.
    // Objects can be treated as objects of a common superclass
    // Polymorphism can be achieved by using the interfaces too.

    horse horse = new horse();
    cycle cycle = new cycle();
    boat boat = new boat();

    horse.go();
    cycle.go();
    boat.go();

    modeOfTransportation[] modeOfTransportations = {horse, cycle, boat};
   System.out.println("This is from the advance for loop: ");
    for(modeOfTransportation modeOfTransportation : modeOfTransportations)
    {
      modeOfTransportation.go();
    }

   } 
}
