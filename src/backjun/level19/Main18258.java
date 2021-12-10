package backjun.level19;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<String> que = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer tokenizer;
        String command;
        for (int i = 0; i < n; i++) {
            tokenizer = new StringTokenizer(br.readLine());
            command = tokenizer.nextToken();
            if (command.equals("push")) {
                que.add(tokenizer.nextToken());
            } else {
                switch (command) {
                    case "pop":
                        if (que.isEmpty()) {
                            bw.write("-1\n");
                        } else {
                            bw.write(que.removeFirst()+"\n");
                        }
                        break;
                    case "size":
                        bw.write(que.size()+"\n");
                        break;
                    case "empty":
                        if (que.isEmpty()){
                            bw.write("1\n");
                        }else {
                            bw.write("0\n");
                        }
                        break;
                    case "front":
                        if (que.isEmpty()){
                            bw.write("-1\n");
                        }else {
                            bw.write(que.peekFirst()+"\n");
                        }
                        break;
                    case "back":
                        if (que.isEmpty()){
                            bw.write(-1+"\n");
                        }else {
                            bw.write(que.peekLast()+"\n");
                        }
                        break;
                }
            }


        }
        bw.flush();
        bw.close();
    }
}
