package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {


        new Book();                     //Példányosítsd, de ne add értékül semminek
        System.out.println(new Book());

        Book emptyBook;
     //   System.out.println(emptyBook);  //nem lehet, nincs inicializálva.

        emptyBook = null;
        System.out.println(emptyBook);          //null

        System.out.println(emptyBook == null);

        Book book = new Book();
        System.out.println(book);
        book = null;
        System.out.println(book);

        book = new Book();
        System.out.println("Book ref: " +book);

        Book anotherBook = new Book();


        System.out.println(book == anotherBook);

        anotherBook = book;
        System.out.println("Another book ref: " + anotherBook);
        System.out.println(book == anotherBook);

        Book[]books = {new Book(), new Book(), new Book()};
        System.out.println(Arrays.toString(books));

        List<Book>bookList = Arrays.asList(new Book(), new Book(), new Book());
        System.out.println(bookList);

        List<Book>bookList2 = new ArrayList<>();
        bookList2.add(new Book());
        bookList2.add(new Book());
        bookList2.add(new Book());
        System.out.println(bookList2);

    }
}
