package backjun.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int num = 666;
        String result="";
        while (count!=n){
            if (Integer.toString(num).contains("666")){
                count++;
                result = Integer.toString(num);
            }
            num++;
        }
        System.out.println(result);
    }
}