package backjun.level3;

import java.util.Scanner;

public class Main2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1;i<9;i++){
            System.out.println(n+" * "+i+" = "+i*n);
        }
        System.out.print(n+" * "+9+" = "+9*n);
    }
}
