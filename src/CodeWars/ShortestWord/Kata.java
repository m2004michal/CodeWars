package CodeWars.ShortestWord;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Kata {
    public static int findShort(String s) {
        List<String> words = Arrays.asList(s.split(" "));
        return words.stream().min(Comparator.comparing(String::length)).get().length();
    }

    public static void main(String[] args) {
        System.out.println(findShort("abc ads sad asd das gda rt bcx fdfo"));
    }
}
