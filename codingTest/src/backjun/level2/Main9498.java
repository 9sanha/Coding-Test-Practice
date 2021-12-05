package backjun.level2;

import java.util.Scanner;

public class Main9498 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        char result = score<60?'F':(score<70?'D':(score<80?'C':(score<90?'B':'A')));
        System.out.println(result);
    }
}
