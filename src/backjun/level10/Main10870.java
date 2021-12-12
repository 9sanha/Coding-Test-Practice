package backjun.level10;

import java.util.Scanner;

public class Main10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
    private static int fibonacci(int num){
        if (num<=1){
            return num;
        }else {
            return fibonacci(num-1)+fibonacci(num-2);
        }
    }
}
