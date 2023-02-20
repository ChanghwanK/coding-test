package org.example.programmers.lv_02.큰_수_만들기_2;

public class Solution2 {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int next = 0;

        for (int i = 0; i < number.length() - k; i++) {
            int max = 0;

            for (int j = index; j <= i + k; j++) {
                int current = number.charAt(j) - '0';

                if (max < current) {
                    max = current;
                    next = j;
                }
            }
            sb.append(max);
            index = next + 1;
        }
        return sb.toString();
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        var result = solution.solution("1234", 2);
        System.out.println("result: " + result);
    }
}
