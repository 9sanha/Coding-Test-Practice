package backjun.level11;

import java.util.Scanner;

//블랙잭
public class Main2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int newSum = 0;
        int[] cardDeck = new int[n];
        int result = 0;

        for (int i = 0; i < n; i++) {
            cardDeck[i] = sc.nextInt();
        }


        // pick[i][j][k]
        for (int i = 0; i < n - 2; i++) {
            if (m - newSum == 0) {
                break;
            }
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    newSum = (cardDeck[i] + cardDeck[j] + cardDeck[k]);
                    if (m - result > m - newSum&&newSum<=m) {
                        result = newSum;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
