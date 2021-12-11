package backjun.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int num = 666;
        String res="";
        while (result!=n){
            if (Integer.toString(num).contains("666")){
                result++;
                res = Integer.toString(num);
            }
            num++;
        }
        System.out.println(res);
    }
}
