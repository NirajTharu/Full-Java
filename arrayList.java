
import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        
        // ArrayList: A resizeable array that stores objects(autoboxing).
        // Arrays are fixed in size, but arrayList can change.

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println("This one is the list of Integer: " + list);

        // To remove an element 
        list.remove(0); 
        System.out.println(list);

        // Fruits
        ArrayList<String> Fruits = new ArrayList<>();
        Fruits.add("Apple");
        Fruits.add("Banana");
        Fruits.add("Kiwi");
        Fruits.add("Watermelon");

        System.out.println("The ArrayList of fruits is below: " + Fruits);

        // To replace an element at any index
        Fruits.set(0,"Mango");
        System.out.println("The Replaced arrayList is below: "+Fruits);

        // To just output an element of a certain number
        System.out.println("The first element of Fruits ArrayList is: " + Fruits.get(0));

        // To find the size of an ArrayList
        System.out.println("The size of an arrayList of Fruits is: " + Fruits.size());

        // To sort the arrayList
        Collections.sort(Fruits);
        System.out.println("The sorted arrayList is below: " + Fruits);

        // Using advance for loop to iterate through all the data
        System.out.println("This is done using the advance for loop: ");
        for(String fruit : Fruits)
        {
            System.out.println(fruit);
        }
    }
}
