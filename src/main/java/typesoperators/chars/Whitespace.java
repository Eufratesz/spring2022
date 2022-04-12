package typesoperators.chars;

public class Whitespace {

    public String makeWhitespaceToStar(String text){
        char[]characters = text.toCharArray();
        for(int i = 0; i < characters.length; i++){
            if(Character.isWhitespace(characters[i])){
                characters[i] = '*';
            }
        }
        String result = new String(characters);
        return result;

    }

    public static void main(String[] args) {
        Whitespace whitespace = new Whitespace();
        System.out.println(whitespace.makeWhitespaceToStar("Ez itt egy alma vagy egy körte?"));
    }
}
