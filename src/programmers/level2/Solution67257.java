package programmers.level2;

import java.util.Set;
import java.util.TreeSet;

public class Solution67257 {
    public long solution(String expression) {
        expression = expression.replace("-", " - ");
        expression = expression.replace("+", " + ");
        expression = expression.replace("*", " * ");
        String[] exprArr = expression.split(" ");
        Set<String> cSet = setCal(exprArr);
        String[] comList = combination(cSet);
        String[] sArr;
        long temp = 0;
        long a, b;
        for (String s : comList) {
            sArr = s.split("");
            a = Integer.parseInt(exprArr[0]);
            for (String s1 : sArr) {
                for (int i = 1; i < exprArr.length / 2; i++) {
                    if (i % 2 == 1) {
                        b = Integer.parseInt(exprArr[i + 1]);
                        a = cal(a, b, s1);
                    }
                }
            }
            temp = Math.max(temp, Math.abs(a));
        }
        long answer = temp;
        return answer;
    }

    // 부호 조합 배열 리턴
    private static String[] combination(Set<String> set) {
        String[] comArr;
        int n = set.size();
        if (n == 3) {
            comArr = new String[]{"+-*", "+*-", "*-+", "-*+", "-+*", "*+-"};
            return comArr;
        } else if (n == 2) {
            String[] a = set.toArray(new String[2]);
            comArr = new String[2];
            comArr[0] = a[0] + a[1];
            comArr[1] = a[1] + a[0];
            return comArr;
        } else {
            return set.toArray(new String[1]);
        }
    }

    //부호 몇개 있는 지 판단
    private static Set<String> setCal(String[] exprArr) {
        Set<String> cSet = new TreeSet<>();
        for (String s : exprArr) {
            if (!s.matches("[+-]?\\d*(\\.\\d+)?")) {
                cSet.add(s);
            }
        }
        return cSet;
    }

    //그저 계산
    private static long cal(long a, long b, String c) {
        switch (c) {
            case "*":
                return a * b;
            case "-":
                return a - b;
            case "+":
                return a + b;
        }
        return 0;
    }


    public static void main(String[] args) {
        String ex = "100-200*300-500+20";
        Solution67257 solution67257 = new Solution67257();
        System.out.println(solution67257.solution(ex));
    }
}
