package programmers.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sol3 {
    public int solution(int n) {
        int answer = 0;

        int div3 = n / 3;
        // 5상자 로만 운반했을 때
        int div5 = n / 5;
        // 5상자로만 운반할 때 남는 설탕
        // - 3상자만으로만 운반할 때 남는 옷은 비효율적이라 변수처리 안함
        int mod5 = n % 5;
        // 5상자에 일단 최대한 담음
        int box5 = div5;
        // 3상자에는 아무것도 안담움
        int box3 = 0;

        // 옷 수가 5 이하일 때 연산
        if (5 >= n) {
            if (mod5 == 0 || n % 3 == 0) {
                answer=1;
            } else {
                answer = -1;
            }
        }
        //5상자만으로 운반 가능할 때
        else if (mod5 == 0) {
            answer=n / 5;
        }
        //5상자에 다 담고 남은 옷을 3상자로 다 담을 수 있을 때
        else if (mod5 % 3 == 0) {
            answer=box5 + mod5 / 3;
        }
        // 그 외
        else {
            while (true) {
                // 각 상자에 담은 옷 수와 모든 옷 수가 값을 때
                if (n - ((box5 * 5) + (box3 * 3)) == 0) {
                    answer=box3 + box5;
                    break;
                }
                // 3상자로 옮긴게
                else if (div3 < box3) {
                    answer=-1;
                    break;
                } else {
                    if (box5 != 0 && (n - box5 * 5) % 3 != 0) {
                        box5--;
                    }
                    box3++;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {

    }

}
