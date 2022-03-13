package classstructuremethods;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("Agatha Christie", "And there were none");

        book.register("123456");

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " +book.getTitle());
        System.out.println("Regnumber: " +book.getRegNumber());
    }
}
