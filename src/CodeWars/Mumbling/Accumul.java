package CodeWars.Mumbling;

public class Accumul {

    private static String accum(String s) {
        String [] arr = s.split("");
        StringBuilder sb = new StringBuilder();
        String[] strings = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sb.setLength(0);
            for (int i1 = 0; i1 < i + 1; i1++)
                sb.append(arr[i]);
            sb.append("-");
            String str = sb.toString().toLowerCase();
            strings[i] = str.substring(0, 1).toUpperCase() + str.substring(1);
        }
            sb.setLength(0);
        for (String string : strings)
            sb.append(string);
        return sb.toString().substring(0, sb.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
    }
}
