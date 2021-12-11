package backjun.level16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> withdrawal = new ArrayList<>();
        int sum = 0;
        int n = sc.nextInt();
        int j = 0;
        for (int i = 0; i < n; i++) {
            withdrawal.add(Integer.parseInt(sc.next()));
        }
        Collections.sort(withdrawal);

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i+1; k++) {
                sum+= withdrawal.get(k);
            }
        }


        System.out.println(sum);

    }




    }

