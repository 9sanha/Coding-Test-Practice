package programmers.level1;

import java.util.Arrays;

public class Solution12982 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i : d) {
            budget -= i;
            if (budget>=0){
                answer++;
            }else {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        Solution12982 solution12982 = new Solution12982();
        System.out.println(solution12982.solution(d,budget));

    }
}
