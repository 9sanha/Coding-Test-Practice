package backjun.level2;

import java.util.Scanner;

//사분면 구하기
// 2 \ 1
//--------
// 3 \ 4
public class Main14681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        if (x > 0) {
            if (y > 0) {
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        } else if (x < 0 ) {
            if (y>0){
                System.out.println(2);
            }else {
                System.out.println(3);
            }
        }
    }
}
