package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Crossword {

    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("KULCS", "KÁLYHA", "lÓ", "AJTÓ", " CSERESZNYEFA", "TEJ", "FELHŐ", "CIPŐ",
                "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA");

        for (String word : wordList) {
            List<String> sixLetterWords = new ArrayList<>();
            if (word.length() == 6) {
                sixLetterWords.add(word);
                System.out.println(sixLetterWords);
            }
        }
    }
}
