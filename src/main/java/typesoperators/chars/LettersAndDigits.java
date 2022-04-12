package typesoperators.chars;

public class LettersAndDigits {

    public void printLetterOrDigit(String text) {
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                System.out.println(c + " : számjegy");
            } else if (Character.isAlphabetic(c)) {
                System.out.println(c + " : betű");
            } else {
                System.out.println(c + " : egyéb");
            }
        }
    }

    public static void main(String[] args) {
        LettersAndDigits lettersAndDigits = new LettersAndDigits();
        lettersAndDigits.printLetterOrDigit("bfa68fF;X");
    }
}
