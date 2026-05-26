public class inheritance {
    public static void main(String[] args) {
        

        // is connected to animal.java, dog.java, cat.java, 
        // Inheritance: one class inherits the method and attributes of another class. grandparent -> parent -> child 

        dog dog = new dog();
        cat cat = new cat();
        plant plant = new plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.eat();
        cat.eat(); 

        System.out.println("The total number of lives of cat is: " + cat.lives);
        System.out.println("The total number of lives of dog is: " + dog.lives);

        dog.speak();
        cat.speak();

        plant.photosynthesize();
    }
}
