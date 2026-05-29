import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        
        // HashMap = A data structure that stores key value pairs, keys are unique but values can be duplicated, Does not mainatin any order, but memory efficient
        // HashMap<Key,value>

        HashMap<String, Double> map = new  HashMap<>();

        map.put("Apple", 0.3);
        map.put("banana",0.2);
        map.put("kiwi",0.4);
        map.put("coconut",1.0);

        System.out.println(map);

        // To remove any specific element using key
        map.remove("kiwi");
        System.out.println(map);

        // To get the value with the help of key
        System.out.println(map.get("coconut"));
        
        // To check if it exists
        System.out.println(map.containsKey("banana"));

        if(map.containsKey("kiwi"))
        {
            System.out.println(map.get("kiwi"));
        }
        else{
            System.out.println("Key not found.");
        }

        // To check if the map contains value
        System.out.println(map.containsValue(0.3));

        // To check the size of the map
        System.out.println(map.size());

        // To get all the elements of the hashMap
        for(String key : map.keySet() )
        {
            System.out.println(key + ": $" + map.get(key));
        }
    }
}
