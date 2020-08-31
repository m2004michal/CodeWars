package CodeWars.SumOfDigits;


import java.util.ArrayList;

//public class DRoot {
    //my program
//    public static int digital_root(int n) {
//        ArrayList<Integer> ints = new ArrayList<>();
//        do {
//                String[] strings = Integer.toString(n).split("");
//                n = 0;
//                for (String string : strings) {
//                    n += Integer.parseInt(string);
//            }
//        }while (n >=10);
//        return n;
//    }
    //best practice
    public class DRoot {
        private static int digital_root(int n) {
            return (n != 0 && n%9 == 0) ? 9 : n % 9;
        }


    public static void main(String[] args) {
        System.out.println(DRoot.digital_root(323));
    }
}
