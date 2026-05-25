public class object{
    public static void main(String[] args) {
        
        // Object: An entity that holds data(attributes) and can perform actions(methods). It is a refrence data type.

        Car car = new Car(); 
        System.out.println("Model of the Car: " + car.model);
        System.out.println("Manufactured Year : "+ car.year);

        car.stop();
        car.start();
        car.drive();
        car.Break();
    }
}