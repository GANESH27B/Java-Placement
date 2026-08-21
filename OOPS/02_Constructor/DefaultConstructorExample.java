class DefaultBook {
    String title = "Java Basics";

    DefaultBook() {
        System.out.println("Default constructor called");
    }
}

public class DefaultConstructorExample {
    public static void main(String[] args) {
        DefaultBook book = new DefaultBook();
        System.out.println(book.title);
    }
}