package backjun.level16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int coin;
        int temp;
        List<Integer> coinList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            coin = Integer.parseInt(sc.next());
            if (coin <= k) {
                coinList.add(coin);
            }else {
                break;
            }
        }
        if (coinList.size() == 1) {
            count = k / coinList.get(0);
            System.out.println(count);
        } else {
            for (int i = 0; i < coinList.size(); i++) {
                // 큰수 부터 시작
                temp = coinList.get(coinList.size() - (i+1));
                count += k / temp;
                // 나누어 떨어지면
                if (k % temp == 0) {
                    break;
                }
                // 다음 연산 필요할 때

                k -= (k / temp) * temp;
            }
            System.out.println(count);

        }
    }
}
