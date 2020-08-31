package CodeWars.CreditCardMask;

public class Maskify {

    private static String maskify(String str) {
        return str.replaceAll(".(?=.{4})", "#");
    }
//    public static String maskify(String str) {
//        StringBuilder sb = new StringBuilder();
//        if (str.length() > 4) {
//            for (int i = 0; i < str.length() - 4; i++) {
//                sb.insert(i, "#");
//            }
//            return sb.toString() + str.substring(str.length() - 4, str.length());
//        }else
//            return str;
//    }


    public static void main(String[] args) {
        System.out.println(Maskify.maskify("45556"));
    }
}
