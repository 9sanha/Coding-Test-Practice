package backjun.lever12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main4949 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String text;
        String s;
        boolean isYes;
        Stack<String> vps = new Stack<>();
        while (true) {

            isYes = true;
            text = br.readLine();

            if (text.equals(".")) {
                break;
            }
            text = text.replace(" ", "");
            for (String c : text.split("")) {
                if (c.equals("(") || c.equals("[")) {
                    vps.push(c);
                } else if (c.equals(")") || c.equals("]")) {
                    if (vps.empty()) {
                        System.out.println("no");
                        isYes = false;
                        break;
                    } else {
                        s = vps.pop();
                        if (c.equals(")")) {
                            if (s.equals("[")) {
                                System.out.println("no");
                                isYes = false;
                                break;
                            }
                        }else if (c.equals("]")){
                            if (s.equals("(")){
                                System.out.println("no");
                                isYes = false;
                                break;
                            }
                        }
                    }
                }
            }
            if (!vps.empty()&&isYes){
                System.out.println("no");
            }else if(vps.empty()&&isYes){
                System.out.println("yes");
            }
            vps.clear();
            s="";
        }
    }
}
