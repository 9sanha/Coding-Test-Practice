package codility;

public class Solution4 {
    public int solution(int X, int Y, int D){
        Y-=X;
        int r = Y%D;
        int result = Y/D;
        if (r==0){
            return result;    
        }else return ++result;
    }

    public static void main(String[] args) {
        Solution4 solution4 =new Solution4();
        int r = solution4.solution(1,1000000000,2);
        System.out.println("r = " + r);
    }
}
