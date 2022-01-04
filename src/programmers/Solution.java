package programmers;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int solution(int N,int M){
        Deque<Integer> dq = new LinkedList<>();

        int res=1;
        for (int i = 0; i < N; i++) {
            dq.add(i);
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                dq.addLast(dq.pollFirst());
            }
            if (dq.peek()==0){
                break;
            }else {
                res++;
                dq.removeFirst();
                dq.addFirst(0);
            }
        }
        return res;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 10;
        int m = 4;
        int r = solution.solution(n,m);
        System.out.println("r = " + r);

    }
}
