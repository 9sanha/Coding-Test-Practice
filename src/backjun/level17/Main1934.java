package backjun.level17;

import java.util.Scanner;

public class Main1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a,b;
        for (int i = 0; i < t; i++) {
            a= sc.nextInt();
            b= sc.nextInt();
            if (a==b){
                System.out.println(a);
            }else if (Math.max(a,b)%Math.min(a,b)==0){
                System.out.println(Math.max(a,b));
            }else {
                System.out.println(LCM(a,b));
            }
        }

    }
    private static int LCM(int n1, int n2){
        int a1 = n1;
        int a2 = n2;
        while (n1!=n2){
            if (n1>n2){
                n2+=a2;
            }else {
                n1+=a1;
            }
        }
        return n1;
    }
}
