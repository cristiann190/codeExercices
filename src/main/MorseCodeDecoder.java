package main;

import java.util.HashMap;
import java.util.Map;

public class MorseCodeDecoder {
    private static final Map<String, String> MorseCode = new HashMap<>();

    public static String decode(String morseCode) {
        String[] words = morseCode.trim().split("   ");
        StringBuilder returnSentence = new StringBuilder();
        for (String word : words) {
            String[] letters = word.trim().split(" ");
            for (String letter : letters) {
                returnSentence.append(MorseCode.get(letter));
            }
            returnSentence.append(" ");
        }
        return returnSentence.toString().trim();
    }

    public static String decodeOptimized(String morseCode) {
        String result = "";
        for (String word : morseCode.trim().split("   ")) {
            for (String letter : word.split("\\s+")) {
                result += MorseCode.get(letter);
            }
            result += ' ';
        }
        return result.trim();
    }
}