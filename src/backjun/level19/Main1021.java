package backjun.level19;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main1021 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] numArr = new int[m];
        for (int i = 0; i < m; i++) {
            numArr[i] = sc.nextInt();
        }

        int num;
        LinkedList<Integer> queue = createQueue(n);
        int count = 0;
        int qPoint = 0;
        int qIndex;
        while (qPoint < numArr.length) {
            num = numArr[qPoint];
            qIndex = queue.indexOf(num);
            if (queue.peekFirst() == num) {
                qPoint++;
                queue.removeFirst();
            } else {
                //찾으려고 하는 원소 위치 파악
                // 짝수일때
                if (queue.size() % 2 == 0) {
                    //원소의 위치가 리스트 길이의 절반보다 앞에 있을 때
                    if (queue.size() / 2 - 1 >= qIndex) {
                        // 찾고자 하는 원소가 가장 앞에 올 때까지 뒤로 보내기
                        for (int i = 0; i < qIndex; i++) {
                            count++;
                            queue.addLast(queue.peekFirst());
                            queue.removeFirst();
                        }
                    } else {
                        for (int i = 0; i < queue.size() - qIndex; i++) {
                            count++;
                            queue.addFirst(queue.peekLast());
                            queue.removeLast();
                        }
                    }
                } else {
                    //원소의 위치가 리스트 길이의 절반보다 앞에 있을 때
                    if (queue.size() / 2 >= qIndex) {
                        // 찾고자 하는 원소가 가장 앞에 올 때까지 뒤로 보내기
                        for (int i = 0; i < qIndex; i++) {
                            count++;
                            queue.addLast(queue.peekFirst());
                            queue.removeFirst();
                        }
                        //원소의 위치가 리스트 길이의 절반보다 뒤에 있을 때
                    } else if(queue.size() / 2 <= qIndex){
                        for (int i = 0; i < queue.size() - qIndex; i++) {
                            count++;
                            queue.addFirst(queue.peekLast());
                            queue.removeLast();
                        }
                        //원소가 정가운데에 있을 때
                    }else {
                        // 찾아야하는 다음 원소가 있고 그 원소가 절반보다 앞에 있을 때
                        if (qPoint+1 < numArr.length){
                            if (queue.size()+1>=queue.indexOf(numArr[qPoint+1])){
                                for (int i = 0; i < qIndex; i++) {
                                    count++;
                                    queue.addLast(queue.peekFirst());
                                    queue.removeFirst();
                                }
                            }else {
                                for (int i = 0; i < queue.size() - qIndex; i++) {
                                    count++;
                                    queue.addFirst(queue.peekLast());
                                    queue.removeLast();
                                }
                            }
                        }else {
                            for (int i = 0; i < queue.size() - qIndex; i++) {
                                count++;
                                queue.addFirst(queue.peekLast());
                                queue.removeLast();
                            }
                        }
                    }
                }

            }

        }
        System.out.println(count);

    }

    private static LinkedList<Integer> createQueue(int n) {
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        return queue;
    }
}
