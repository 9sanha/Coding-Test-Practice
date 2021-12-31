package codility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution5 {
    public int solution(int[] A){
        List<Integer> integerList = Arrays.stream(A)
                .boxed()
                .collect(Collectors.toList());
        for (int i = 1; i < A.length+1; i++) {
            if (!integerList.contains(i)){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        int[] arr = {1,3,4,5,6,7,2,9,8,10,13,11};

        System.out.println(solution5.solution(arr));
    }
}
