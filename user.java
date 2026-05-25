public class user {
    
    String userName; 
    String email;
    int age;

    user()
    {
        this.userName = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }
    user(String userName)
    {
        this.userName = userName;
        this.email = "Not provided";
        this.age = 0;
    }
    user(String userName, String email)
    {
        this.userName = userName;
        this.email = email;
        this.age = 0;
    }
    user(String userName, String email,int age)
    {
        this.userName = userName;
        this.email = email;
        this.age = age;
    }
}
