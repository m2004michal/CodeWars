package CodeWars.TwoToOne;

import java.util.Collections;
import java.util.TreeSet;

public class TwoToOne {

    private static String longest(String s1, String s2) {
        TreeSet<String> set = new TreeSet<>();
        StringBuilder sb = new StringBuilder();
        String str = s1 + s2;
        String[] arr = str.split("");
        Collections.addAll(set, arr);
        for (String s : set) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(TwoToOne.longest("abcdcdcdc", "xyzxcywz"));
    }
}
