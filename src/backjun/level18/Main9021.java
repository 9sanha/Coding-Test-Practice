package backjun.level18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main9021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        boolean isOut;

        for (int i = 0; i < t; i++) {
            isOut = false;
            Stack<String> vps = new Stack<>();
            String str = br.readLine();
            for (String s : str.split("")) {
                if (s.equals("(")) {
                    vps.push(s);
                } else if (s.equals(")")) {
                    if (vps.empty()){
                        System.out.println("NO");
                        isOut =true;
                        break;
                    }
                    vps.pop();
                }
            }

            if (!vps.empty()) {
                System.out.println("NO");
            }else if (!isOut){
                System.out.println("YES");
            }

        }
    }


}
