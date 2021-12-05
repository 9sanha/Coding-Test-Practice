package backjun.level3;

import java.io.*;
import java.util.Arrays;

public class Main15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int a, b;
        String ab;
        for (int i = 0; i < t; i++) {
            ab = br.readLine();
            a = Integer.parseInt(ab.split(" ")[0]);
            b = Integer.parseInt(ab.split(" ")[1]);
            bw.write(a + b + "\n");
        }
        bw.flush();
        bw.close();
    }
}
