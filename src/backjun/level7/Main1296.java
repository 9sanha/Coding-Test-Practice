package backjun.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1296 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();
        int L, O, V, E, temp;
        int max = 0;
        int t = Integer.parseInt(br.readLine());
        Map<String, Integer> perMap = new HashMap<>();
        String[] teamArr = new String[t];

        for (int i = 0; i < t; i++) {
            teamArr[i] = br.readLine();
        }
        String val = teamArr[0];

        for (String s : teamArr) {
            L = nameCount("L", s + name);
            O = nameCount("O", s + name);
            V = nameCount("V", s + name);
            E = nameCount("E", s + name);
            perMap.put(s, nameCalculator(L, O, V, E));
        }

        for (Map.Entry<String, Integer> entry : perMap.entrySet()) {
            temp = entry.getValue();
            if (max < temp) {
                val = entry.getKey();
                max = entry.getValue();
            } else if (max == temp) {
                if (entry.getKey().compareTo(val) < 0) {
                    val = entry.getKey();
                }
            }
        }
        System.out.println(val);


    }

    private static int nameCount(String alph, String names) {
        return names.length() - names.replace(alph, "").length();
    }

    private static int nameCalculator(int L, int O, int V, int E) {
        return ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;
    }
}
