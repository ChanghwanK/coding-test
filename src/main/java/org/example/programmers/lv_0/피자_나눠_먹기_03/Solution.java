package org.example.programmers.lv_0.피자_나눠_먹기_03;

public class Solution {
    // 한조각씩 이상
    public int solution(int slice, int n) {
        int answer = 0;
        int temp = n % slice;
        if (temp == 0) {
            return n / slice;
        } else {
            answer = n / slice + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var result = solution.solution(7, 10);
        System.out.println("Result: " + result);
    }
}
