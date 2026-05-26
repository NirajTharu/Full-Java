public class intefaces {

    public static void main(String[] args) {
        
        // Interface: A blueprint for a class that specifies a set of abstract methods that implementing classes must define.
        // Supports multiple inheritance-like behaviour.
        rabbit rabbit = new rabbit();
        hawk hawk = new hawk();
        catFish catFish = new catFish();

        hawk.hunt();
        rabbit.flee();
        catFish.hunt();
        catFish.flee();
        
    }
}