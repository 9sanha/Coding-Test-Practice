package backjun.lever12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int sum = 0;
        Stack<Integer> money = new Stack<>();
        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                money.pop();
            } else {
                money.push(n);
            }
        }
        for (Integer integer : money) {
            sum += integer;
        }
        System.out.println(sum);
    }
}
