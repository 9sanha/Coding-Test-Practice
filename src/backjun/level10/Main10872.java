package backjun.level10;

import java.util.Scanner;

public class Main10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));

    }
    private static int factorial(int num){
        if (num<=1){
            return 1;
        }else {
            return num*factorial(num-1);
        }
    }
}
