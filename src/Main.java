import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Chechov", "roses", 256, "65.291.2 Б81.");
        System.out.println(book);
        book.changeAuthor();
        book.changePageCount();
        System.out.println(book);
    }
}


