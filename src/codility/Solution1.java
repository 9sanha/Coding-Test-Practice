package codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution1 {
    public int solution(int N){
        String[] b = Integer.toBinaryString(N).split("");
        int result = 0;
        int temp = 0;
        //긴거 반환 없으면 0
        for (String s : b) {
            if (s.equals("0")){
                result++;
            }else {
                if (temp<result){
                    temp = result;
                }
                result=0;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int a =solution1.solution(1041);
        System.out.println("a = " + a);
    }
}
