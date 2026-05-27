public class book {

    String title;
    int pages;

    book(String title, int pages)
    {
        this.title = title;
        this.pages = pages;
    }

    String displayBookInfo()
    {
        return this.title + " is a book and has total number of " + this.pages + " pages.";
    }
    
}
