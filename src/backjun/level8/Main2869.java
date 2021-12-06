package backjun.level8;

import java.io.*;
import java.util.StringTokenizer;

public class Main2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(tokenizer.nextToken());
        int b = Integer.parseInt(tokenizer.nextToken());
        int v = Integer.parseInt(tokenizer.nextToken());

        if ((v - b) % (a - b) == 0) {
            bw.write(Integer.toString(((v - b) / (a - b))));
        } else {
            bw.write(Integer.toString(((v - b) / (a - b) + 1)));
        }
        bw.flush();
        bw.close();
    }


}