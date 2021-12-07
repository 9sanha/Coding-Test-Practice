package backjun.level9;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main1929 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m; i < n+1; i++) {
            if (isPrimeNum(i)){
                bw.write(i+"\n");
            }
        }
        bw.flush();
        bw.close();
    }

    private static boolean isPrimeNum(int num) {

        if ((num==2||num==3)){return true;}
        else if (num==1){return false;}

        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
