package programmers.level2;

import java.util.Stack;

//BFS
public class Solution1829 {

    public String solution(String vote) {
        String [] voteList = vote.split("");
        int countA = 0;
        int countB = 0;
        int countC = 0;
        String answer = "";
        for (String s : voteList) {
            switch (s){
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "C":
                    countC++;
                    break;
            }
        }
        if (countC>=voteList.length/2){
            answer="C";
        }else if (countA>countB){
            answer = "A";
        }else if (countA<countB){
            answer = "B";
        }else {
            answer="AB";
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
