package org.example.programmers.lv_01.삼진_뒤집기;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String changedValue = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(changedValue);
        String reversedValue = sb.reverse().toString();

        answer = Integer.parseInt(reversedValue, 3);
        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(45);
        System.out.println("result: " + result);
    }
}
