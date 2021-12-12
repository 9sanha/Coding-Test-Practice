package backjun.level12;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2750 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            intList.add(sc.nextInt());
        }
        Collections.sort(intList);
        for (Integer integer : intList) {
            bw.write(integer+"\n");
        }
        bw.flush();
        bw.close();
    }
}
