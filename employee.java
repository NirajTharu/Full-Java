public class employee extends person{
    
    // This is connected to the person.java 

    int salary;
    
    employee(String firstName , String lastName, int salary)
    {
        super(firstName,lastName);
        this.salary = salary; 
    }
    void showSalary(){
        System.out.println(this.firstName+ "'s Salary is: " + this.salary);
    }
}
