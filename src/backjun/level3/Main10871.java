package backjun.level3;

import java.io.*;
import java.util.StringTokenizer;

public class Main10871 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;
        StringTokenizer tokenizerList;
        tokenizer = new StringTokenizer(br.readLine());
        tokenizerList = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int x = Integer.parseInt(tokenizer.nextToken());
        int listNum;
        for (int i = 0;i<n;i++){
            listNum =Integer.parseInt(tokenizerList.nextToken());
            if (listNum<x){
                bw.write(listNum+" ");
            }
        }
        bw.flush();
        bw.close();

    }
}
