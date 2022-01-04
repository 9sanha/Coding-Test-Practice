package programmers.level2;

import java.util.*;

public class Sol4 {
    public int solution(int K, String[] user_scores) {

        int answer = 0;

        List<String> user = new ArrayList<>();
        List<Integer> score = new ArrayList<>();

//        List<Map<String, Integer>> listMap = new ArrayList<Map<String ,Integer>>();
        Map<String, Integer> userMap = new LinkedHashMap<>();
        String[] a = new String[2];
        for (String user_score : user_scores) {
            a = user_score.split(" ");
            user.add(a[0]);
            score.add(Integer.parseInt(a[1]));
        }
        int i = 0;
        String u;
        int s;
        List<String> topList = new ArrayList<>();
        boolean isChange;
        while (userMap.size() != K+1) {
            u = user.get(i);
            s = score.get(i);
            if (userMap.isEmpty()) {
                userMap.put(u, s);
                topList.add(u);

            } else {
                isChange = false;
                // 동일 유저 기록 갱신
                for (int j = 0; j < userMap.size(); j++) {
                    if (userMap.get(topList.get(j)) < s) {
                        isChange = true;
                    }
                }
                userMap.put(u, s);
                if (!topList.contains(u)) {
                    topList.add(u);
                }
                if (isChange) {
                    answer++;
                }
                i++;
            }
        }
        for (int j = i; j <user.size()-1; j++) {
            isChange = false;
            u = user.get(j);
            s = score.get(j);
            for (int k = 0; k < userMap.size(); k++) {
                if (userMap.get(topList.get(k)) < s) {
                    userMap.remove(topList.get(k));
                    userMap.put(u, s);
                }
                if (!topList.contains(u)) {
                    topList.add(u);
                    isChange = true;
                }
                if(isChange){answer++;}

            }
        }
        return answer;


    }

    public static void main(String[] args) {
        Sol4 sol4 = new Sol4();
        int K = 2;
//        String[] st = {"alex111 100", "cheries2 200", "alex111 200", "cheries2 150", "coco 50", "coco 200"};
        String[] st = {"alex111 100", "cheries2 200", "coco 150", "luna 100", "alex111 120", "coco 300", "cheries2 110"};
        System.out.println(sol4.solution(K,st));
    }
}
