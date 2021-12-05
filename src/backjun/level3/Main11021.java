package backjun.level3;

import java.io.*;
import java.util.StringTokenizer;

public class Main11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer;
        int t = Integer.parseInt(br.readLine());
        for (int i = 1;i<t+1;i++){
            tokenizer = new StringTokenizer(br.readLine());
            bw.write("Case #"+i+": "+(Integer.parseInt(tokenizer.nextToken())+Integer.parseInt(tokenizer.nextToken()))+"\n");
            bw.flush();
        }
    }
}
