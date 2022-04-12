package typesoperators.chars;

public class Words {

//    public void pushWord(String word){
//        char[] characters = word.toCharArray();
//        for(char c : characters){
//            System.out.print((char)(c + 1));
//        }
//
//    }

    public void pushWord(String word) {
        char[] characters = word.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            characters[i] += 1;
        }
        String newString = new String(characters);
        System.out.println(newString);
    }

    public static void main(String[] args) {
        Words words = new Words();
        words.pushWord("alma");
        words.pushWord("korte");
    }
}
