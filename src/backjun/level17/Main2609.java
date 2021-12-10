package backjun.level17;

import java.util.Scanner;

public class Main2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        //최대공약수
        System.out.println(GCF(num1,num2));
        //최소공배수
        System.out.println(LCM(num1,num2));
    }
    private static int GCF(int n1,int n2){
        int a = Math.min(n1, n2);
        for (int i = a; i > 1 ; i--) {
            if (0 == n1 % i && n2 % i== 0){
                return i;
            }
        }
        return 1;
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
