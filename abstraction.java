public class abstraction {
    // 
    public static void main(String[] args) {
        // Abstract: Used to define abstract classes and methods.

        // Abstraction is process of hiding implementation details and showing only the essetntial features; Abstract class CAN't be instantiated
        // directly. Can contain 'abstract' methods(which must be implemented)
        // Can contain 'concrete' methods(which are inherited )

        circle circle = new circle(3);
        rectangle rectangle = new rectangle(3,5);
        triangle triangle = new triangle(2,5);

        System.out.println("The are of circle is: " + circle.Area());
        System.out.println("The area of the rectangle is: " + rectangle.Area());
        System.out.println("The are of the triangle is: " + triangle.Area());
    }
}
