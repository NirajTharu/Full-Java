public class library {
    
    String nameOfLibrary;
    int establishedYear;

    book[] books;

    library(String nameOfLibrary,int establishedYear, book[] books)
    {
        this.nameOfLibrary = nameOfLibrary;
        this.establishedYear = establishedYear;
        this.books = books;
    }
    void displayInfo()
    {
        System.out.println("The " + this.nameOfLibrary +" is a private library of Mr.chang  and was established in " + this.establishedYear + " with future design.");
        System.out.println("Books available are: ");
        for(book book : books)
        {
            System.out.println(book.displayBookInfo());
        }
    }
}
