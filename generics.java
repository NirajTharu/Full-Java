 
public class generics {
    public static void main(String[] args) {
        
        // Generics: A concept where you can write a class, interface or method that is compatible with differnt data types.
        // <T> type parameter(Place holder that gets replaced with a real data type)
        // <String> type argument(specifies the type)

        box<Integer> box = new box<>();
        product<String,Double> product1 = new product<>("Apple", 22.22);
        product<String, Integer> product2 = new product<>("ticket",22);  

        box.setItem(3); 

        System.out.println(box.getItem());

        System.out.println(product1.getitem());
        System.out.println(product1.getprice());

        System.out.println(product2.getitem());
        System.out.println(product2.getprice());
    }
}
