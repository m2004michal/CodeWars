package CodeWars.IsNumberPrime;

public class Prime {
//my code
    private static boolean isPrime(int num){
        if (num <=1){
            return false;
        }else
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0){
                    return false;
                }
            }
        return true;
    }
//best practice
//    public static boolean isPrime(int num){
//        return num > 1 && java.math.BigInteger.valueOf(num).isProbablePrime(1);
//    }

    public static void main(String[] args) {
        System.out.println(isPrime(9));
    }
}
