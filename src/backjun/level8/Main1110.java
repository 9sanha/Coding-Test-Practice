package backjun.level8;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new BufferedInputStream(System.in)));
        String n = br.readLine();
        if (n.length()<2){
            n="0"+n;
        }
        String n1 = n.split("")[0];
        String n2 = n.split("")[1];
        int count = addCycle(n1,n2,Integer.parseInt(n),0);
        System.out.println(count);

    }

    private static int addCycle(String n1, String n2, int num, int count) {

        if (Integer.parseInt(n1 + n2) == num&&count!=0) {
            return count;
        }else {
            String a = Integer.toString(Integer.parseInt(n1)+Integer.parseInt(n2));
            count++;
            return addCycle(n2,a.split("")[a.length()-1],num,count);
        }
    }


}
