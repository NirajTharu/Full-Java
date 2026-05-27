public class aggregation {
    public static void main(String[] args) {
        
        // Aggregation: Represents a "has-a" relationship between objects. One object contains another object as a part of its structure.
        // But the contained object/s can exists independently.

        book book1 = new book("IT", 1111);
        book book2 = new book("C++", 1283);
        book book3 = new book("Multimedia Computing", 1199);

        book[] books = {book1,book2,book3};
        System.out.println(book1.displayBookInfo());

        for(book singlBook : books)
        {
            System.out.println(singlBook.displayBookInfo());
        }

        library library = new library("Quite && Peace", 1914, books);
        library.displayInfo();
    }
}
