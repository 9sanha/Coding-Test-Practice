package programmers.level2;

public class Solution {
    public String solution(String m, String[] musicinfos) {
        m = replaceShap(m);

        String answer = "";

        return answer;
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
