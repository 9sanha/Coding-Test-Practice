package backjun.level8;

import java.io.*;
import java.util.StringTokenizer;

//호텔

public class Main10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            tokenizer = new StringTokenizer(br.readLine());
            //방호수 리턴  acmSystem(높이 , 길이, 순서)
            int room = acmSystem(tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken());
            bw.write(room+"\n");
            bw.flush();
        }

        bw.close();
        br.close();
    }

    private static int acmSystem(String h, String w, String n) {
        // 필요 없음
//        int W = Integer.parseInt(w);
        int H = Integer.parseInt(h);
        int N = Integer.parseInt(n);
        // 자주 쓰여서 변수로 둠
        int mod = (N % H);
        int div = N / H;
        //엘베랑 붙어있는 방을 제외한 모든 방
        if (mod == 0) {return div + H * 100;}
        //엘베랑 붙어있는 방
        else {return div + 1 + mod * 100;}
    }
}