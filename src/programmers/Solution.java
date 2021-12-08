package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public String solution(String m, String[] musicinfos) {
        m = replaceShap(m);

        String answer = "";
        String[] stor;
        Integer[] stor2 = new Integer[2];
        String[] time;
        Integer playTime;
        //노래 제목
        List<String> sTitle = new ArrayList<>();
        //노래 길이
        Map<String, Integer> sLength = new TreeMap<String, Integer>();
        // 악보
//        List<String> sSheet = new ArrayList<>();
        Map<String, String> sSheet = new TreeMap<>();
        //반복문 돈 악보

        //들어온 곡 만큼 돔
        for (String music : musicinfos) {

            StringBuilder sht = new StringBuilder();

            stor = music.split(",");

            stor[3] = replaceShap(stor[3]);

            for (int i = 0; i < 2; i++) {
                time = stor[i].split(":");

                stor2[i] = hToM(time[0], time[1]);
            }

            playTime = stor2[1] - stor2[0];

            for (int i = 0; i < playTime; i++) {
                sht.append(stor[3]);
            }

            sLength.put(stor[2], playTime);
            sTitle.add(stor[2]);
            sSheet.put(stor[2], sht.substring(0, playTime));
        }

        List<String> containList = new ArrayList<>();

        // 일치 항목 판단

        for (String s : sTitle) {
            if (sSheet.get(s).contains(m)) {
                containList.add(s);
            }
        }

        if (containList.size() == 0) {
            answer = "(None)";
            return answer;
        } else if (containList.size() == 1) {
            answer = containList.get(0);
            return answer;
        } else {
            int temp = 0;
            int len;
            for (String s : containList) {
                len = sLength.get(s);
                if (len > temp) {
                    answer = s;
                    temp = len;
                } else if (len == temp) {
                    answer = "";
                }
            }

            for (String s : containList) {
                if (temp != sLength.get(s)) {
                    containList.remove(s);
                }
            }

            //길이가 같다면..
            if (answer.equals("")) {

                int indexTemp;
                int index = 100;
                for (String s : containList) {
                    indexTemp = sTitle.indexOf(s);
                    if (indexTemp < index) {
                        index = indexTemp;
                    }
                }
                return containList.get(index);
            } else {
                return answer;
            }
        }
    }


    private Integer hToM(String h, String m) {
        return Integer.parseInt(h) * 60 + Integer.parseInt(m);
    }

    private String replaceShap(String a) {
        a = a.replace("C#", "c");
        a = a.replace("D#", "d");
        a = a.replace("F#", "f");
        a = a.replace("G#", "g");
        a = a.replace("A#", "a");
        return a;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String m = "CDEFGAC";
        String[] musicinfos = new String[3];
        musicinfos[0] = "12:00,12:07,HELLO,CDEFGAC";
        musicinfos[1] = "04:00,04:08,BAR,ABC";
        musicinfos[2] = "04:00,04:07,BAh,CDEFGAC";

        String a = solution.solution(m, musicinfos);
        System.out.println("a = " + a);
        // "HELLO"
    }
}
