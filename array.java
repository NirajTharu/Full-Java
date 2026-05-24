import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        
        // Array: a collection of values of same data type
        
        String[] fruits = {"apple","banana","cherry"};

        // To print out full array
        System.out.println(Arrays.toString(fruits));

        // To print out the specifi index of array
        System.out.println(fruits[1]);

        // To insert in specific part of array
        fruits[0] = "avacado";
        System.out.println(Arrays.toString(fruits));

        // To find the length of an array
        int numOfElements = fruits.length;
        System.out.println(numOfElements);

        // Printing all the elements of array using for loop
        System.out.println("This is from the for loop: ");
        for(int i = 0;i < fruits.length; i++)
        {
            // System.out.println(fruits[i]);
            System.out.print(fruits[i] + " ");
        }
        System.out.println();
        // Printing all the elements of the array using advance for loop
        // Also known as for each loop
        System.out.println("This is from the enhanced for loop: ");
        for(String fruit : fruits)
        {
            System.out.println(fruit);
        }

        // To short an array
        Arrays.sort(fruits);

        // To fill the full array 
        Arrays.fill(fruits,"apple");
        System.out.println(Arrays.toString(fruits));
    }
}
