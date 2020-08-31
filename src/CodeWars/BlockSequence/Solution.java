package CodeWars.BlockSequence;

import java.util.ArrayList;
import java.util.List;

public class Solution {
//    public static int solve(long n){
//        List<String> infiniteNumbers  =new ArrayList<>();
//        StringBuilder str = new StringBuilder();
//        for (long i = 1; i < n + 1; i++) {
//            infiniteNumbers.add(str.append(i).toString());
//        }
//        StringBuilder sb = new StringBuilder();
//        infiniteNumbers.forEach(sb::append);
//
//        int i = (int)n - 1;
//        List<String> infiniteNumbers2 = Arrays.asList(sb.toString().split(""));
//
//        return Integer.parseInt(infiniteNumbers2.get(i));
//    }

//    public static int solve(long n){
//        List<String> infiniteNumbers2 =new ArrayList<>();
//        StringBuilder str = new StringBuilder();
//
//        for (long i = 0; i < n + 1; i++) {
//            infiniteNumbers2.add(str.append(i + 1).toString());
//        }
//        return Integer.parseInt(String.valueOf(str.toString().charAt(Integer.parseInt(String.valueOf(n)))));
//    }



//
//public class Solution {
//    public static int solve(long n){
//        StringBuilder sum1 = new StringBuilder();
//        StringBuilder sum2 = new StringBuilder();
//        for (long i = 1; i < n + 1; i++)
//            sum2.append(sum1.append(i));
//
//        return Integer.parseInt(String.valueOf(sum2.charAt(Integer.parseInt(String.valueOf(n-1)))));
//    }



//kind of works but gets stuck on heap space error

    //best one yet
    //36678L 1 time
//    public static int solve(long n){
//        List<String> infiniteNumbers2 =new ArrayList<>();
//        StringBuilder str = new StringBuilder();
//
//        for (long i = 0; i < n + 1; i++) {
//            infiniteNumbers2.add(str.append(i + 1).toString());
//        }
//        return Integer.parseInt(String.valueOf(str.toString().charAt(Integer.parseInt(String.valueOf(n)))));
//    }

//    public static int solve(long n){
//        List<String> infiniteNumbers2 =new ArrayList<>();
//        StringBuilder str = new StringBuilder();
//
//        for (long i = 0; i < n + 1; i++) {
//            infiniteNumbers2.add(str.append(i + 1).toString());
//        }
//        return Integer.parseInt(String.valueOf(str.toString().charAt(Integer.parseInt(String.valueOf(n)))));
//    }



//    public static int solve(long n) {
//        StringBuilder sum1 = new StringBuilder();
//        StringBuilder sum2 = new StringBuilder();
//        long length = 0;
//        for (long i = 1; i < n + 1; i++) {
//            length += i;
//            if (length > n) {
////                System.out.println(length);
//                System.out.println("Lenght " + length);
//                long toDesired = n - length;
//                System.out.println("To Desired " + toDesired);
//                for (long j = 1; j <= n + 1; j++) {
//                    sum1.append(sum2.append(j));
//                }
//                System.out.println(sum1.toString());
//                char desired = sum1.toString().charAt(sum1.length() + (int)toDesired);
//                System.out.println("desired " + desired);
//                    return (int) toDesired;
//                }
//
//            }
//            return (int)length;
//        }
//
//        public static long lenghtOfString ( long number){
//            long numberOfDigits = ("" + number).length();
//            double numberOfDigitsInString = 0;
//            for (long i = 1; i <= numberOfDigits; i++) {
//                if (i < numberOfDigits) {
//                    numberOfDigitsInString += (Math.pow(10, i) - Math.pow(10, i - 1)) * i;
//                } else {
//                    numberOfDigitsInString += (number - Math.pow(10, i - 1) + 1) * i;
//                }
//            }
//            return (long) numberOfDigitsInString;
//        }
//
//import java.util.ArrayList;
//import java.util.List;
//

//        public static int solve(long n){
//            List<Long> longs = new ArrayList<>();
//            long i, j;
//            for (i=1;i<=n;i++) {
//                for (j = 1; j <= i; j++) {
//                    longs.add(j);
//                }
//            }
//            return Integer.parseInt(String.valueOf(longs.get(Integer.parseInt(String.valueOf(n - 1)))));
//        }





    public static void main(String[] args) {

    }
    //record = 36678L 1 time
}
