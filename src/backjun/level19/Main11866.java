package backjun.level19;

import java.util.LinkedList;
import java.util.Scanner;

public class Main11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<");
        int n = sc.nextInt();
        int k = sc.nextInt();
        LinkedList<Integer> yo = new LinkedList<>();

        for (int i = 1; i <n+1 ; i++) {
            yo.add(i);
        }

        for (int j = 0; j < n; j++) {
            if (yo.size()==1) break;
            for (int z = 0; z <k-1 ; z++) {
                yo.addLast(yo.peekFirst());
                yo.removeFirst();
            }
            stringBuilder.append(yo.getFirst()+", ");
            yo.removeFirst();
        }
        stringBuilder.append(yo.getFirst()+">");
        System.out.println(stringBuilder);
    }
}
