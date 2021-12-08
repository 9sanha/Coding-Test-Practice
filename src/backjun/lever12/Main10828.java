package backjun.lever12;

import java.io.*;
import java.util.Stack;

public class Main10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();
        String act;
        String val;
        for (int i = 0; i <t ; i++) {
            act = br.readLine();
            if (act.contains("push")){
                val = act.split(" ")[1];
                stack.push(val);
            }else {
                switch (act){
                    case "top":
                        if (stack.empty()){
                            bw.write("-1"+"\n");
                            bw.flush();
                            break;
                        }else {
                            bw.write(stack.peek()+"\n");
                            bw.flush();
                            break;
                        }
                    case "pop":
                        if (stack.empty()){
                            bw.write("-1"+"\n");
                            bw.flush();
                            break;
                        }else {
                            bw.write(stack.pop()+"\n");
                            bw.flush();
                            break;
                        }
                    case "size":
                        bw.write(stack.size()+"\n");
                        bw.flush();
                        break;
                    case "empty":
                        byte b = (byte) (stack.empty()?1:0);
                        bw.write(b+"\n");
                        bw.flush();
                        break;
                }
            }
        }

        bw.close();
    }

}
