package backjun.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//오각형
public class Main1964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n==5){
            System.out.println(5);
        }
        long s = 5L;
        for (int i = 1;i<n;i++){
            s += 7L+ 3L *(i-1);

        }
        System.out.println(s%45678);
    }
}
