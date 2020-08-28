package CodeWars.Test;

public class Test {

    public static long c;
    public static long toDesired;

    public static long CheckLenght(long n){
        long sum = 0;
        long j;
        for (j = 0; j < n + 1; j++) {

            sum += Test.lenght(j);

            if (sum >= n) {
                break;
            }
        }
        return lenght(n);
}

        public static long lenght(long n ){

        long sum = 0;
            for (c = 1; c < n + 1; c++) {

                if (c >= 100000000000000000L) {
                    sum += 18;
                    continue;
                }
                if (c >= 10000000000000000L) {
                    sum += 17;
                    continue;
                }
                if (c >= 1000000000000000L) {
                    sum += 16;
                    continue;
                }
                if (c >= 100000000000000L) {
                    sum += 15;
                    continue;
                }
                if (c >= 10000000000000L) {
                    sum += 14;
                    continue;
                }
                if (c >= 1000000000000L) {
                    sum += 13;
                    continue;
                }
                if (c >= 100000000000L) {
                    sum += 12;
                    continue;
                }
                if (c >= 10000000000L) {
                    sum += 11;
                    continue;
                }
                if (c >= 1000000000) {
                    sum += 10;
                    continue;
                }
                if (c >= 100000000) {
                    sum += 9;
                    continue;
                }
                if (c >= 10000000) {
                    sum += 8;
                    continue;
                }
                if (c >= 1000000) {
                    sum += 7;
                    continue;
                }
                if (c >= 100000) {
                    sum += 6;
                    continue;
                }
                if (c >= 10000) {
                    sum += 5;
                    continue;
                }
                if (c >= 1000) {
                    sum += 4;
                    continue;
                }
                if (c >= 100) {
                    sum += 3;
                    continue;
                }
                if (c >= 10) {
                    sum += 2;
                    continue;
                }
                if (c < 10) {
                    sum++;
                    continue;
                }
            }

            return sum;
        }



    public static void main(String[] args) {
        System.out.println(CheckLenght(10000000000L));

    }
}
