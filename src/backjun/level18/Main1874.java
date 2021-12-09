package backjun.level18;

import java.io.*;
import java.util.Objects;
import java.util.Stack;

public class Main1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] numArr = new int[n];

        for (int i = 0; i <n ; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }
        int k = 0;
        int j=1;
        while (true){
            if (k==n|| stack.size()>n){
                break;
            }
            if (stack.isEmpty()){
                stack.add(j);
                st.append("+\n");
                j++;
            }else if (Objects.equals(stack.peek(), numArr[k])){
                stack.pop();

                st.append("-\n");
                k++;
            }else {
                stack.add(j);
                st.append("+\n");

                j++;
            }
        }
        if (stack.empty()){
            System.out.println(st);
        }else {
            System.out.println("NO");
        }
    }
}
