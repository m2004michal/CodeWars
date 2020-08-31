package CodeWars.MultipliesOf3Or5;

public class Solution {

    private int solution(int number) {
        int  sum = 0;
        for(int i=0; i <number; i++){
            if(i % 3 == 0 || i % 5 == 0)
                sum = sum+i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(20));
    }
}
