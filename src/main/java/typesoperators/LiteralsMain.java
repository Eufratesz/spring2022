package typesoperators;

public class LiteralsMain {

    public static void main(String[] args) {

        System.out.println(1 + ""+ 2);
        System.out.println(Integer.toString(1) + Integer.toString(2));

        double quotient = 3/4D;
        System.out.println(quotient);

        long big = 3_244_444_444L;
        System.out.println(big);

        String word ="title".toUpperCase();
        System.out.println(word);

        int i = 1;
        int j = -2;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(j));
    }
}
