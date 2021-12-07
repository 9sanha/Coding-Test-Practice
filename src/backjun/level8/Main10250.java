package backjun.level8;

import java.io.*;
import java.util.StringTokenizer;

public class Main10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            tokenizer = new StringTokenizer(br.readLine());
            int room = acmSystem(tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken());
            bw.write(room+"\n");
            bw.flush();
        }

        bw.close();
        br.close();
    }

    private static int acmSystem(String h, String w, String n) {
        int H = Integer.parseInt(h);
        int W = Integer.parseInt(w);
        int N = Integer.parseInt(n);
        int mod = (N % H);
        int div = N / H;

        if (mod == 0) {
            return div + H * 100;
        } else {
            return div + 1 + mod * 100;
        }
    }
}