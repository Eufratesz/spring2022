package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {

        String prefix;
        prefix = "Hello ";

        String name;
        name = "John Doe";

        String message;
        message = prefix + name;
        System.out.println(message);        //Hello John Doe

        message = message + 444;
        System.out.println(message);        //Hello John Doe444

        boolean b;
        b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");
        System.out.println(b);              //false
        System.out.println(c);              //true

        String first = "";
        String second = "";
        String concat = first + second;
        System.out.println(concat);                 //semmit nem ír ki
        System.out.println(concat.length());    //0

        String str = "Abcde";
        System.out.println(str.length());                                //5
        System.out.println(str.substring(0,1) + "," + str.substring(2,3));  //A,c
        System.out.println(str.substring(0,3));                         //ABC

    }
}
