package objects.attributes;

public class BookMain {


    public static void main(String[] args) {
        Book book = new Book("And there were none");
        System.out.println(book.getTitle());
        book.setTitle("Crooked house");
        System.out.println(book.getTitle());
    }
}
