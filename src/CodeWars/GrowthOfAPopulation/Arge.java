package CodeWars.GrowthOfAPopulation;

public class Arge {

    private static int nbYear(int p0, double percent, int aug, int p) {
        int n=0;
       double population = p0;
       while(population <=p){
           if(population <=p){
               population = population + population * (percent / 100) + aug;
               n++;
           }
       }
       return n;
    }

    public static void main(String[] args) {
        System.out.println(Arge.nbYear(1500000, 2.5, 10000, 2000000));

    }
}
