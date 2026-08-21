class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Book book = new Book("Java Basics", "James Gosling");
        book.displayBook();
    }
}