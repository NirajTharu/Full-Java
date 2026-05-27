public class getterAndSetter {
    public static void main(String[] args) {
        // They help protect the object data and add rules to for accessing and modifying them.
        // GETTER: Method that make a field READABLE
        // SETTER: Method that make a field WRITEABE

        forest forest = new forest("Bamboo", 10000, true); 

        forest.settreesName("Mango");
        forest.settreesNumber(100);

        System.out.println(forest.gettreesName() + " has the number of " +forest.gettreesNumber() + " and is alive: " + forest.getisAlive());
    }
}