package codility;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public int solution(int[] A){
        List<String > nList = new ArrayList<>();
        String c;
        for (int i : A) {
            c=Integer.toString(i);
            if (nList.contains(c)&& !nList.isEmpty()){
                nList.remove(c);
            }else {
                nList.add(c);
            }
        }
        return Integer.parseInt(nList.get(0));

    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int[] nArr = {2,4,5,3,2,5,4};
        System.out.println(solution3.solution(nArr));
    }
}
