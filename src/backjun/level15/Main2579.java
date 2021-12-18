package backjun.level15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] n = new int[t + 1];
        int[] dp = new int[t + 1];

        for (int i = 1; i < t + 1; i++) {
            n[i] = Integer.parseInt(br.readLine());
        }
        if (t == 1) {
            System.out.println(n[1]);
        } else {
            dp[0] = 0;
            dp[1] = n[1];
            dp[2] = Math.max((n[1] + n[2]), n[2]);

            for (int i = 3; i < t + 1; i++) {
                dp[i] = Math.max((dp[i - 2] + n[i]), (n[i - 1] + dp[i - 3] + n[i]));
            }
            System.out.println(dp[t]);
        }


    }
}
