package CodeWars.HammingCode;

import java.util.ArrayList;

public class HammingCode {

    public String encode(String text) {
        String bits = "";
        for (int i = 0; i < text.length(); i++) {
            int dec = (int) text.charAt(i);

            String result = "00000000";
            int j = result.length() - 1;
            while (dec != 0) {
                char a[] = result.toCharArray();
                a[j--] = String.valueOf(dec % 2).charAt(0);
                result = new String(a);
                dec = dec / 2;
            }
            bits += result;
        }

        bits = bits.replaceAll("0", "2");
        bits = bits.replaceAll("1", "111");
        bits = bits.replaceAll("2", "000");

        return bits;
    }

    public String decode(String bits){
        int l = bits.length();
        int l2;
        String text = "";
        String afterConverting = "";
        ArrayList<String> tripleNumbers= new ArrayList<>();
        ArrayList<String> octNumbers = new ArrayList<>();

        for (int i = 0; i < l/3; i++) {
            tripleNumbers.add(bits.substring(0, 3));
            bits = bits.substring(3);
        }


        for (int i = 0; i < tripleNumbers.size(); i++) {
            int count = 0;
            for (int i1 = 0; i1 < 3; i1++) {
                if (String.valueOf(tripleNumbers.get(i).charAt(i1)).equals("0"))
                    count++;
            }
            if (count > 1)
                afterConverting += "0";
            else afterConverting += 1;

        }

        l2 = afterConverting.length();

        for (int i = 0; i < l2/8; i++) {
            octNumbers.add(afterConverting.substring(0, 8));
            afterConverting = afterConverting.substring(8);
        }
        for (String s : octNumbers) {
            text += (char)Integer.parseInt(s, 2);
        }
        return text;
    }

    public static void main(String[] args) {
        HammingCode hammingCode = new HammingCode();
        hammingCode.decode(hammingCode.encode("hey"));
    }
}
