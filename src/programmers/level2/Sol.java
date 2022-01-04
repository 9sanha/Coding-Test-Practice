package programmers.level2;

import java.util.Arrays;

public class Sol {

    public int solution(int[] v) {
        int answer = 0;

        int vLen = v.length;
        int[] v1 = new int[vLen];
        // v 오름차순 정렬
        v = Arrays.stream(v).sorted().toArray();
        //반 잘라서 짝수
        int h = vLen / 2;
        // 반-1에 가장 큰수 반+1에 가장 작은수

        //짝수일 때
        if (v.length % 2 == 0) {
            for (int i = 0; i < h; i++) {
                if (i % 2 == 0) {
                    v1[h - 1 - i] = v[vLen - 1 - i];
                    v1[h + i] = v[i];
                } else {
                    v1[h + i] = v[vLen - 1 - i];
                    v1[h - 1 - i] = v[i];
                }
            }

        } else {

            v1[h] = v[vLen - 1];
            for (int j = 1; j < h + 1; j++) {
                if (j % 2 != 0) {
                    v1[h - j] = v[j - 1];
                    v1[h + j] = v[j];
                } else {
                    v1[h + j] = v[vLen - j];
                    v1[h - j] = v[vLen - j - 1];
                }
            }
        }
        //계산
        int temp = v1[0];
        for (int k = 1; k < vLen; k++) {
            answer += Math.abs(temp - v1[k]);
            temp = v1[k];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] v = {20, 8};
        Sol sol = new Sol();
        System.out.println(sol.solution(v));

    }
}
