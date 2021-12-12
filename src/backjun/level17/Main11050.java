package backjun.level17;

import java.util.Scanner;

public class Main11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nF = factorial(n);
        if (k==0||n==k){
            System.out.println(1);
        }else {
            int kF = factorial(k);
            int nSubkF = factorial(n - k);
            System.out.println(nF / (kF * nSubkF));
        }
    }

    private static int factorial(int num){

        if (num<=1){
            return num;
        }else {
            return num*factorial(num-1);
        }
    }
}
