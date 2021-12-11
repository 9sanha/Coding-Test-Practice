package backjun.level11;

import java.util.Scanner;

public class Main2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        int n = sc.nextInt();
        int constructor = n;

        String chrN;
        for (int i = 1; i < n; i++) {
            chrN = Integer.toString(i);
            sum = i;
            for (int j = 0; j < chrN.length(); j++) {
                sum += Integer.parseInt(chrN.split("")[j]);
            }
            if (sum == n) {
                constructor = i;
                break;
            }
        }
        if (constructor == n) {
            System.out.println(0);
        } else {
            System.out.println(constructor);
        }
    }
}
