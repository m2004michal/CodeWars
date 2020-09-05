package CodeWars.LargeFactorials;


import java.math.BigInteger;

public class Kata {


//    static String Factorial(int n) {
//
//        int[] arr = new int[500];
//        arr[0] = 1;
//        int sizeOfArray = 1;
//
//        for (int x = 2; x <= n; x++) {
//            int carry = 0;
//            for (int i = 0; i < sizeOfArray; i++) {
//                int prod = arr[i] * x + carry;
//
//                arr[i] = prod % 10;
//                carry = prod / 10;
//            }
//
//            while (carry != 0) {
//                arr[sizeOfArray] = carry % 10;
//                carry = carry / 10;
//                sizeOfArray++;
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = sizeOfArray - 1; i >= 0; i--)
//            sb.append(arr[i]);
//
//        return sb.toString();
//    }


    //best solution
    private static String Factorial(int n) {
        return java.util.stream.IntStream.rangeClosed(1, n)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger::multiply)
                .toString();
    }

    public static void main(String[] args) {
        System.out.println(Factorial(5));
    }

}



