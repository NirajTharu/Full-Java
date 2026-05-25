public class constructor {
    public static void main(String[] args) {
        // This one is connected with Student.java
        // Constructor is a special method to initialize objects. You can pass argumsnts to the constructor and set up initial value.
        Student student1 = new Student("Nikita",23,3.5);
        Student student2 = new Student("Nikihil",18,3.3);
        Student student3 = new Student("Nirma",22,3.3);
        

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.study();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.study();

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        student3.study();
    }
}
