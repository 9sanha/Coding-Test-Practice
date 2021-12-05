package backjun.level3;

import java.io.*;

public class Main2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = n; i > 0; i--) { // 5 4 3 2 1
            for (int j = 1; j < n+1 ; j++) { // 1 2 3 4 5
                if (j < i) {
                    bw.write(" ");
                } else {
                    bw.write("*");
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
