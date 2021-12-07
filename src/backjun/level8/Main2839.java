package backjun.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int div3 = n / 3;
        int div5 = n / 5;
        int mod5 = n % 5;
        int bag5 = div5;
        int bag3 = 0;
        if (5 >= n) {
            if (mod5 == 0 || n % 3 == 0) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        } else if (mod5 == 0) {
            System.out.println(n / 5);
        } else if (mod5 % 3 == 0) {
            System.out.println(bag5 + mod5 / 3);
        } else {
            while (true) {
                if (n - ((bag5 * 5) + (bag3 * 3)) == 0) {
                    System.out.println(bag3 + bag5);
                    break;
                } else if (div3 < bag3) {
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

