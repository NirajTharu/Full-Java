
public class anonymousClass {
    public static void main(String[] args) {
        
        // Anonymous Class: A class that does not have name.Can not be reused. Add custom behaviour without having to create a new class.
        // Often used for one time uses(Timer task, Runnable, callbacks)
        
        
        pigeon pigeon1 = new pigeon();
        pigeon pigeon2 = new pigeon(){
            @Override
            void speak()
            {
                System.out.println("I am the leader of squad.");
            }
        };
         
        pigeon1.speak(); 
        pigeon2.speak();
    }
}
 