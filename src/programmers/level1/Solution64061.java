package programmers.level1;

import java.util.Stack;


public class Solution64061 {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int peek;
        int answer = 0;
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                peek = board[j][moves[i] - 1];
                board[j][moves[i] - 1] = 0;
                //꺼낼게 있을 때
                if (peek != 0) {
                    //스택이 비어있을 때
                    if (stack.empty()) {
                        stack.push(peek);
                        //스택이 비어있지 않고 넣고자 하는 숫자가 가장 위의 숫자와 같을 때
                    } else if (stack.peek() == peek) {
                        stack.pop();
                        answer+=2;
                        //스택이 비어있지는 않고 넣고자 하는 숫자가 가장 위의 숫자와 다를 때
                    } else {
                        stack.push(peek);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int board[][] = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int moves[] = {1, 5, 3, 5, 1, 2, 1, 4};
        Solution64061 solution64061 = new Solution64061();
        System.out.println(solution64061.solution(board, moves));
    }
}
