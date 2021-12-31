package codility;

import java.util.*;

public class Solution2 {
    public int[] solution(int[] A, int K){
    Deque<Integer> queue = new LinkedList();
        for (int i : A) {
            queue.add(i);
        }
        for (int i = 0; i < K; i++) {
            queue.addLast(queue.pollFirst());
        }
        return queue.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {
        int[] nArr = {1,2,3,4,5};
        int k = 3;
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution(nArr,k)[0]);
    }
}
