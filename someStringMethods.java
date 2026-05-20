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
        System.out.printf("The replace name is: %s\n",name);
        System.out.printf("The last index of r is at index of %d\n",lastIndex);
        System.out.printf("The index of the char i is in %d\n",index);
        System.out.printf("The first char in the name is %c\n",letter);
        System.out.printf("There are %d char in %s.\n",length, name);
    }
}
