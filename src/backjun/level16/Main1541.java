package backjun.level16;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result;
        s = s.replace("+", " + ");
        s = s.replace("-", " - ");
        StringTokenizer st = new StringTokenizer(s);
        result = Integer.parseInt(st.nextToken());
        boolean isSum = true;
        String token;
        int a = st.countTokens();
        for (int i = 0; i <a ; i++) {
            token = st.nextToken();
            if (token.equals("-")){
                isSum = false;
            }else if (!token.equals("+")){
                if (isSum){
                    result+=Integer.parseInt(token);
                }else {
                    result-=Integer.parseInt(token);
                }
            }
        }
        System.out.println(result);

    }


}

