package org.example.programmers.lv_0.문자열_밀기_2;

public class Solution {
    private String getPushCurStr(String target) {
        StringBuilder sb = new StringBuilder();
        int targetLength = target.length();

        String lastWord = target.substring(targetLength - 1);
        String otherWords = target.substring(0, targetLength - 1);
        sb.append(lastWord).append(otherWords);
        return sb.toString();
    }

    public int solution(String A, String B) {
        int answer = -1;

        if(A.equals(B)) return 0;

        // A를 왼쪽으로 한 번 밀어봄
        String curStr = A;
        for(int i = 1; i <= A.length() - 1; i++) {
            curStr = getPushCurStr(curStr);
            if(curStr.equals(B)) {
                return i;
            }
        }
        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("hello", "ohell");
        System.out.println("result: " + result);
    }
}
