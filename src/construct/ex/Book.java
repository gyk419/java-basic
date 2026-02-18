package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page: " + page);
    }

    Book(){
        this("","",0);
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }
}
