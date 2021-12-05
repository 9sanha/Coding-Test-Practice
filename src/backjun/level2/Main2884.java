package backjun.level2;

import java.util.Scanner;

//알람 시계
public class Main2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = sc.nextInt();
        if (t==0){
            t=24;
        }
        //전체 시간을 분으로 표현
        m += t*60;
        // - 45분
        m-=45;
        // 시간으로 변환
        t = m/60;
        m %= 60;
        if (t==24){
            t=0;
        }
        System.out.println(t+" "+m);

    }
}
