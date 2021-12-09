package backjun.level19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 우선순위 큐 ( 들어온 순서가 아닌 특정한 조건으로 우선 순위를 매겨 사용)
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (queue.isEmpty()&&x==0){
                System.out.println(0);
            }else if (x==0){
                System.out.println(queue.poll());
            }else {
                queue.add(x);
            }
        }
    }
}
