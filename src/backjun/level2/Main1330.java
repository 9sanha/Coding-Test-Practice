package backjun.level2;

import java.util.Scanner;

public class Main1330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String result = (a>b)?">":(a<b)?"<":"==";
        System.out.println(result);
    }
}
