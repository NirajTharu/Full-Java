public class overloadedConstructor {
    public static void main(String[] args) {
        // iS connected with user.java file
        // Allows the class to have multiple constructors with different parameter lists.Enable objects to be initialize in vaious ways.

        user user1 = new user("Nikita");
        user user2 = new user("Nikhil","nikhil12@gmail.com");
        user user3 = new user("Nirma","nirma@gm.com",22);
        user user4 = new user();


        System.out.println(user1.userName);
        System.out.println(user1.age);
        System.out.println(user1.email );

        System.out.println(user2.userName);
        System.out.println(user2.age);
        System.out.println(user2.email );

        System.out.println(user3.userName);
        System.out.println(user3.age);
        System.out.println(user3.email );

        System.out.println(user4.userName);
        System.out.println(user4.age);
        System.out.println(user4.email );

    }
}
