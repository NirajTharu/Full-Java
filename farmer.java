public class farmer {
    
    // This is connected with the arrayOfObjects.java file
    String name;
    int age;

    farmer(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    void farmerDetails()
    {
        System.out.println("Name of farmer is: " + name);
        System.out.println(this.name+" age is " + this.age);
    }
}
