package backjun.level7;

import java.io.*;
import java.util.Arrays;

public class Main1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] nArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int m = 0,y=0;
        for (int i : nArr) {
            m+=min(i);
            y+=yeong(i);
        }
        String w = m==y?"Y M "+m:(y>m?"M "+m:"Y "+y);
        System.out.println(w);

    }

    private static int min(int i){
        int res=0;
        while (i>=0){
            res+=15;
            i-=60;
        }
        return res;
    }
    private static int yeong(int i){
        int res=0;
        while (i>=0){
            res+=10;
            i-=30;
        }
        return res;
    }
}