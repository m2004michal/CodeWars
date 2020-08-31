package CodeWars.ComplentaryDNA;

import java.util.ArrayList;

public class DnaStrand {
    private static String makeComplement(String dna) {
        String[] strings = dna.split("");
        ArrayList<String> strings1 = new ArrayList<>();
        for (String string : strings) {
            switch (string){
                case "A":
                strings1.add("T");
                break;
                case "T":
                strings1.add("A");
                break;
                case "G":
                strings1.add("C");
                break;
                case "C":
                strings1.add("G");
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        strings1.forEach(sb::append);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC"));
    }
}
