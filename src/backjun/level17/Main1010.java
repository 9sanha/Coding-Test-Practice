package backjun.level17;

import java.math.BigInteger;
import java.util.Scanner;

public class Main1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        BigInteger n,k;
        BigInteger nF,kF,nSubKF;;
        for (int i = 0; i <t ; i++) {
            n = sc.nextBigInteger();
            k = sc.nextBigInteger();
            nF = factorial(n);
            if (k.compareTo(BigInteger.ZERO)==0||n.compareTo(k)==0){
                System.out.println(1);
            }else {
                kF = factorial(k);
                if (n.compareTo(k) < 0){
                    nSubKF = factorial(k.subtract(n));
                    System.out.println(kF.divide(nF.multiply(nSubKF)));
                }else {
                    nSubKF = factorial(n.subtract(k));
                    System.out.println(nF.divide(kF.multiply(nSubKF)));
                }

            }
        }

    }

    private static BigInteger factorial(BigInteger num){

        if (num.compareTo(BigInteger.ONE)==0){
            return BigInteger.ONE;
        }else {
            return factorial(num.subtract(BigInteger.ONE)).multiply(num);
        }
    }
}
