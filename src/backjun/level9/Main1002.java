package backjun.level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            tokenizer = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(tokenizer.nextToken());
            int y1 = Integer.parseInt(tokenizer.nextToken());
            int r1 = Integer.parseInt(tokenizer.nextToken());
            int x2 = Integer.parseInt(tokenizer.nextToken());
            int y2 = Integer.parseInt(tokenizer.nextToken());
            int r2 = Integer.parseInt(tokenizer.nextToken());
            double d = distance(x1, y1, x2, y2);
            //두 원이 같을 때
            if (r1==r2&&d==0){
                System.out.println(-1);
            }
            // 접점 1
            else if (Math.abs(r1-r2)==d||r1+r2==d){
                System.out.println(1);
            }
            // 접점 2
            else if (r1+r2>d&&Math.abs(r1-r2)<d){
                System.out.println(2);
            }else if (r1+r2<d||Math.abs(r1-r2)>d||d==0) {
                System.out.println(0);}
            // 접점 0

        }
    }

    private static double distance(int x1, int y1, int x2, int y2) {
        //double로 안해주면 값 안맞음
        double d = (x1 - x2)* (x1 - x2)  + (y1 - y2) * (y1 - y2);
        return Math.sqrt(d);
    }
}
