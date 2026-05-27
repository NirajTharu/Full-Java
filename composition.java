public class composition {
    public static void main(String[] args) {
        
        // Composition: Represents a "part-of" relation ships between objects.
        // For example: an Engine is a "part of" a car.
        // Allows complex objects to be constructed from smaller objects. 

        fourWheeler fourWheeler = new fourWheeler("Suzuki Maruti", 2020, "V8");

        System.out.println(fourWheeler.model);
        System.out.println(fourWheeler.year);
        System.out.println(fourWheeler.engine.type);

        fourWheeler.start();
    }
}
