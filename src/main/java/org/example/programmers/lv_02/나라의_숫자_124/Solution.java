package org.example.programmers.lv_02.나라의_숫자_124;

public class Solution {
    public String solution(int n) {
        String answer = "";
        String [] nums = {"4", "1", "2"};

        while(n != 0) {
            int index = n % 3;
            n /= 3;

            if(index == 0) n--;

            answer = nums[index] + answer;
        }
        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(4);
        System.out.println("result: " + result);
    }
}
