package backjun.level17;
import java.util.*;

//약수
public class Main1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> numArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numArr.add(sc.nextInt());
        }
        Collections.sort(numArr);
        System.out.println(numArr.get(0)*numArr.get(numArr.size()-1));
    }
}
