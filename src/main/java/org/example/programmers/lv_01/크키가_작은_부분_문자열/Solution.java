package org.example.programmers.lv_01.크키가_작은_부분_문자열;

public class Solution {

    /**
     * t="3141592"이고 p="271" 인 경우, t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다.
     * 이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.
     */
    public int solution(String t, String p) {
        int answer = 0;
        int windowSize = p.length();
        long pIntVal = Long.parseLong(p);

        // 1234 22 12 23 34
        // 12345 333 123 234 345

        // 윈도우 사이즈 만큼 나눈다.
        for (int i = 0; i < t.length() - windowSize + 1; i++) {
            var a = t.substring(i, i + windowSize);
            if (Long.parseLong(a) <= pIntVal) {
                answer ++;
            }

        }

        // 비교한다.


        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        String t = "10203";
        String p = "15";

        var result = solution.solution(t, p);
        System.out.println("result: " + result);
    }

}
