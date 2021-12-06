package backjun.level8;

import java.io.IOException;
import java.util.Scanner;

public class Main1011 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int x, y;
        for (int i = 0; i < t; i++) {
            x = sc.nextInt();
            y = sc.nextInt();

            double distance = y - x;
            int sqrt = (int)Math.sqrt(distance);
            if (sqrt * sqrt == distance) {
                System.out.println(sqrt * 2 - 1);
            } else if (sqrt * sqrt < distance && distance <= sqrt * sqrt+sqrt) {
                System.out.println(sqrt * 2);
            } else {
                System.out.println(sqrt * 2 + 1);
            }
        }
    }
}

