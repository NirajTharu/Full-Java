public class superKeyWord {
    public static void main(String[] args) {
        
        // This is connected to the scholars.java, person.java, employee.java

        // super: Refers to a parent calss(subclass <- superclass)
        // used in constructors and method overriding 
        // Calls the parent constructors to initialize the attributes 

        person person = new person("Nikta", "chawla");
        scholars scholar  = new scholars("Nikihil", "Thapad", 3.3);
        employee employee = new employee("Nirma", "Dastur", 55000);

        person.showName();
        scholar.showName();
        scholar.showGPA();
        employee.showSalary();
    }
}
