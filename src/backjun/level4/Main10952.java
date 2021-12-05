package backjun.level4;

import java.io.*;
import java.util.StringTokenizer;

//A+B - 5
public class Main10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int a,b;
        while (true){
            stringTokenizer = new StringTokenizer(br.readLine());
            a = Integer.parseInt(stringTokenizer.nextToken());
            b = Integer.parseInt(stringTokenizer.nextToken());
            if (a+b==0){
                break;
            }
            int sum = a+b;
            System.out.println(sum);
        }
    }
}
