package programmers;

public class SolutionT {


    public long[] solution(long n) {
        long[] answer = {0, 0};
        long m = 0;
        if (n < 7) {
            if (n < 5) {
                answer[0] = 0;
            } else {
                answer[0] = 1;
            }
            if (n == 1) {
                answer[1] = 1;
            } else {
                answer[1] = 2;
            }
        } else {
            m = n % 7;
            if (m == 0) {
                answer[0] = (n / 7) * 2;
                answer[1] = answer[0];
            } else if (m == 1) {
                answer[0] = (n / 7) * 2;
                answer[1] = answer[0] + 1;
            } else if (m == 6) {
                answer[0] = (n / 7) * 2 + 1;
                answer[1] = answer[0] + 1;
            } else {
                answer[0] = (n / 7) * 2;
                answer[1] = answer[0] + 2;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SolutionT solutionT = new SolutionT();
        long[] a = solutionT.solution(10000000000000000L);
        System.out.println(a[0] + ", " + a[1]);


    }

}
