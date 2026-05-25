public class arrayOfObjects {
    public static void main(String[] args) {
        
        // This is connected with farmer.java file
        // Array of Objects: 

        // farmer farmer1 = new farmer("Nikita",22);
        // farmer farmer2 = new farmer("Nikhil",18);
        // farmer farmer3 = new farmer("Nirma",23);

        // farmer[] farmers = {farmer1,farmer2,farmer3};
        farmer[] farmers = {
                            new farmer("Alvaro", 20),
                            new farmer("Kelly", 18),
                            new farmer("Hayato", 20)
                           };

        // with for loop
        for(int i = 0; i < farmers.length; i++)
        {
            farmers[i].farmerDetails();
        }
        // with advance for loop
        for(farmer farmer : farmers)
        {
            farmer.farmerDetails();
        }

        for(farmer farmer : farmers)
        {
            farmer.age = 19;
        }

        for(farmer farmer : farmers)
        {
            farmer.farmerDetails();;
        }
        
    }
}
