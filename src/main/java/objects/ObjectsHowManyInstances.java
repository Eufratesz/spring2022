package objects;

public class ObjectsHowManyInstances {

    public static void main(String[] args) {


        Book book1 = new Book();  //1
        Book book2 = new Book();   //2
        Book book3 = new Book();       //3
        Book book4 = book1;      //book1-hez már nem lehet hozzáférni.
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book6;
        new Book();             //4, létrejött az objektum, de nem lehet hozzáférni
        book5 = new Book();     //5 objektum jött létre
        book6 = null;
        book5 = book4;

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);      //ugyanaz a referencia
        System.out.println(book4);      //ugyanaz a referencia
        System.out.println(book5);      //ugyanaz a referencia
        System.out.println(book6);      //null
        System.out.println(book7);      //null

        //book1 és book5 referenciája nem hozzáférhető
    }
}