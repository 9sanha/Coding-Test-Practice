package backjun.level11;

import java.util.Scanner;

//한수
public class Main1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] nArr;
        int sub;
        int count;
        int n0, n1;
        StringBuilder builder;

        if (n < 99) {
            count=n;
        } else if (n < 111) {
            count=99;
        } else {
            count = 99;
            for (int i = 111; i < n + 1; i++) {
                builder = new StringBuilder();
                nArr = Integer.toString(i).split("");
                n1 = Integer.parseInt(nArr[1]);
                n0 = Integer.parseInt(nArr[0]);

                if (n1 > n0) {
                    sub = n1 - n0;
                    builder.append(n0);
                    for (int j = 1; j < nArr.length; j++) {
                        n0 += sub;
                        builder.append(n0);
                    }
                } else if (n1 < n0) {
                    sub = n0 - n1;
                    builder.append(n0);
                    for (int j = 1; j < nArr.length; j++) {
                        n0 -= sub;
                        builder.append(n0);
                    }
                } else {
                    for (int j = 0; j < nArr.length; j++) {
                        builder.append(n0);
                    }
                }
                if (Integer.toString(i).contentEquals(builder)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

