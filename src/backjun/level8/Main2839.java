package backjun.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//설탕 운반

public class Main2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
    // 자주 쓰는 연산 변수처리
        // 3가방으로만 운반했을 때
        int div3 = n / 3;
        // 5가방으로만 운반했을 때
        int div5 = n / 5;
        // 5가방으로만 운반할 때 남는 설탕
        // - 3가방만으로만 운반할 때 남는 설탕은 비효율적이라 변수처리 안함
        int mod5 = n % 5;
        // 5가방에 일단 최대한 담음
        int bag5 = div5;
        // 3가방에는 아무것도 안담움
        int bag3 = 0;

        // 설탕 수가 5 이하일 때 연산
        if (5 >= n) {
            if (mod5 == 0 || n % 3 == 0) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        }
        //5가방만으로 운반 가능할 때
        else if (mod5 == 0) {
            System.out.println(n / 5);
        }
        //5가방에 다 담고 남은 설탕을 3가방으로 다 담을 수 있을 때
        else if (mod5 % 3 == 0) {
            System.out.println(bag5 + mod5 / 3);
        }
        // 그 외
        else {
            while (true) {
                // 각 가방에 담은 양과 설탕 총량이 값을 때
                if (n - ((bag5 * 5) + (bag3 * 3)) == 0) {
                    System.out.println(bag3 + bag5);
                    break;
                }
                // 3가방으로 옮긴게
                else if (div3 < bag3) {
                    System.out.println(-1);
                    break;
                } else {
                    if (bag5 != 0&& (n-bag5*5)%3!=0) {
                        bag5--;
                    }
                    bag3++;
                }
            }
        }
    }
}

