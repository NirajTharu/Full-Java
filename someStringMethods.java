public class someStringMethods {
    public static void main(String[] args) {
        
        String name = "Niraj Chaudhary";
        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("i");
        int lastIndex = name.lastIndexOf("r");
        name = name.toUpperCase();
        System.out.printf("The upper case of the name is: %s\n",name);
        name = name.toLowerCase();
        System.out.printf("The lower case of the name is:%s\n",name);
        // name.trim() to trim the white space if any is present before or after the string
        name = name.replace("a", "o");
        System.out.println(name);
        // This will return the boolean value
        System.out.println("The string is empty: " + name);
        System.out.printf("The replace name is: %s\n",name);
        System.out.printf("The last index of r is at index of %d\n",lastIndex);
        System.out.printf("The index of the char i is in %d\n",index);
        System.out.printf("The first char in the name is %c\n",letter);
        System.out.printf("There are %d char in %s.\n",length, name);

        if(name.isEmpty())
        {
            System.out.println("You name field is empty.");
        }
        else{
            System.out.println("Welcome " + name);
        }
        if(name.contains("c"))
        {
            System.out.println("Your name contains: c .");
        }
        else{
            System.out.println("Your name does not contains c.");
        }

        String address = "Bajar";
        if(address.equals("Bajar"))
        {
            System.out.println("Your name is same.");
        }
        else{
            System.out.println("Your name is unique.");
        }
    }
}
