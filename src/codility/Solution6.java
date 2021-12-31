package codility;

public class Solution6 {
    public int solution(int[] A) {
        int a=0;
        int b = 0;
        int c = 1000;
        int temp;
        for (int j = 1; j <A.length ; j++) {
            b+=A[j];
        }
        for (int i = 0; i < A.length; i++) {
            a+=A[i];
            if (i!=0) {
                b -= A[i];
            }
            temp =Math.abs(b-a);
            if (temp==0){
                return 0;
            }else if (temp<c){
                c=temp;
            }


        }
        return c;

    }

    public static void main(String[] args) {
        int[] nArr = {3,-10,-10,3};
        Solution6 solution6 = new Solution6();
        System.out.println(solution6.solution(nArr));
    }
}

