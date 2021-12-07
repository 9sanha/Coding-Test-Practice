package backjun.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        int count;
        while (true) {
            num = Integer.parseInt(br.readLine());
            // 0 입력시 멈춤
            if (num == 0) {break;}
            // 2는 소수 -> 1 리턴
            else if (num == 1) {System.out.println(1);}
            else {
                // 소수 갯수 카운트
                count = 0;
                // num+1 ~ num*2 소수 판별
                for (int i = num + 1; i < num * 2; i++) {
                    if (isPrimeNum(i)) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }


    private static boolean isPrimeNum(int num) {
        // sqrt = 제곱근
        int sqrt = (int) Math.sqrt(num);
        // i : 2 ~ sqrt
        for (int i = 2; i <= sqrt ; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
