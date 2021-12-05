package backjun.level3;

import java.io.*;
import java.util.StringTokenizer;

public class Main11022 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a,b;
        StringTokenizer tokenizer;
        int t = Integer.parseInt(br.readLine());
        for (int i = 1;i<t+1;i++){
            tokenizer = new StringTokenizer(br.readLine());
            a = Integer.parseInt(tokenizer.nextToken());
            b = Integer.parseInt(tokenizer.nextToken());
            bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
            bw.flush();
        }
        bw.close();
    }
}
