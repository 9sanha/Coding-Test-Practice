package backjun.level1;

import java.util.*;

public class Main1076 {
    public static void main(String[] args) {
        Map<String, String> color = new HashMap<>();
        color.put("black", "0");
        color.put("brown", "1");
        color.put("red", "2");
        color.put("orange", "3");
        color.put("yellow", "4");
        color.put("green", "5");
        color.put("blue", "6");
        color.put("violet", "7");
        color.put("grey", "8");
        color.put("white", "9");
        Long result;
        Scanner scanner = new Scanner(System.in);
        String[] strArr = new String[3];
        strArr[0] = color.get(scanner.nextLine());
        strArr[1] = color.get(scanner.nextLine());
        strArr[2] = color.get(scanner.nextLine());
        result = Long.parseLong(strArr[0]+strArr[1]);
        int n = Integer.parseInt(strArr[2]);
        for (int i = 0 ; i<n;i++){
            result*=10;
        }
        System.out.println(result);
    }
}
