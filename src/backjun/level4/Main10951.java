package backjun.level4;


import java.util.Scanner;
import java.util.StringTokenizer;

public class Main10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringTokenizer stringTokenizer;
        int a, b;
        while (scanner.hasNext()) {
            stringTokenizer = new StringTokenizer(scanner.nextLine());
            a = Integer.parseInt(stringTokenizer.nextToken());
            b = Integer.parseInt(stringTokenizer.nextToken());

            int sum = a + b;
            System.out.println(sum);
        }
    }
}
