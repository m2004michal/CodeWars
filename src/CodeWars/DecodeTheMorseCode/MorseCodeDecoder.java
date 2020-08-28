package CodeWars.DecodeTheMorseCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class MorseCodeDecoder {


    public static final Map<String, Character> morseAlphabet = new HashMap<>();
    static {

        morseAlphabet.put("-----", '0');
        morseAlphabet.put(".----", '1');
        morseAlphabet.put("..---", '2');
        morseAlphabet.put("...--", '3');
        morseAlphabet.put("....-", '4');
        morseAlphabet.put(".....", '5');
        morseAlphabet.put("-....", '6');
        morseAlphabet.put("--...", '7');
        morseAlphabet.put("---..", '8');
        morseAlphabet.put("----.", '9');

        morseAlphabet.put(".-", 'A');
        morseAlphabet.put("-...", 'B');
        morseAlphabet.put("-.-.", 'C');
        morseAlphabet.put("-..", 'D');
        morseAlphabet.put(".", 'E');
        morseAlphabet.put("..-.", 'F');
        morseAlphabet.put("--.", 'G');
        morseAlphabet.put("....", 'H');
        morseAlphabet.put("..", 'I');
        morseAlphabet.put(".---", 'J');
        morseAlphabet.put("-.-", 'K');
        morseAlphabet.put(".-..", 'L');
        morseAlphabet.put("--", 'M');
        morseAlphabet.put("-.", 'N');
        morseAlphabet.put("---", 'O');
        morseAlphabet.put(".--.", 'P');
        morseAlphabet.put("--.-", 'Q');
        morseAlphabet.put(".-.", 'R');
        morseAlphabet.put("...", 'S');
        morseAlphabet.put("-", 'T');
        morseAlphabet.put("..-", 'U');
        morseAlphabet.put("...-", 'V');
        morseAlphabet.put(".--", 'W');
        morseAlphabet.put("-..-", 'X');
        morseAlphabet.put("-.--", 'Y');
        morseAlphabet.put("--..", 'Z');

        morseAlphabet.put("·-", 'A');
        morseAlphabet.put("-···", 'B');
        morseAlphabet.put("-·-·", 'C');
        morseAlphabet.put("-··", 'D');
        morseAlphabet.put("·", 'E');
        morseAlphabet.put("··-·", 'F');
        morseAlphabet.put("--·", 'G');
        morseAlphabet.put("····", 'H');
        morseAlphabet.put("··", 'I');
        morseAlphabet.put("·---", 'J');
        morseAlphabet.put("-·-", 'K');
        morseAlphabet.put("·-··", 'L');
        morseAlphabet.put("-·", 'N');
        morseAlphabet.put("·--·", 'P');
        morseAlphabet.put("--·-", 'Q');
        morseAlphabet.put("·-·", 'R');
        morseAlphabet.put("···", 'S');
        morseAlphabet.put("··-", 'U');
        morseAlphabet.put("···-", 'V');
        morseAlphabet.put("·--", 'W');
        morseAlphabet.put("-··-", 'X');
        morseAlphabet.put("-·-−", 'Y');
        morseAlphabet.put("−−··", 'Z');


    }

//        public static String decode(String morseCode) {
//            String decoded = "";
//            for(String word : morseCode.trim().split("   ")) {
//                for(String letter : word.split("\\s+")) {
//                    decoded += MorseCode.get(letter);
//                }
//                decoded += ' ';
//            }
//            return decoded.trim();
//        }

  public static String decode(String morseCode) {
            String decoded = "";
            for(String word : morseCode.trim().split("   ")) {
                for(String letter : word.split("\\s+")) {
                    decoded += morseAlphabet.get(letter);
                }
                decoded += ' ';
            }
            return decoded.trim();
        }


    public static void main(String[] args) {
        System.out.println(MorseCodeDecoder.decode(".   ."));
        System.out.println(MorseCodeDecoder.decode(".... . -.--  .--- ..- -.. ."));
    }
}