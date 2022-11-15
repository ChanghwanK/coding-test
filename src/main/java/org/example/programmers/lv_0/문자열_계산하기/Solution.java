package org.example.programmers.lv_0.문자열_계산하기;

public class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String [] nums = my_string.split(" ");
        answer += Integer.parseInt(nums[0]);
        for(int i = 1; i < nums.length; i+=2) {
            if (nums[i].equals("+")) {
                answer += Integer.parseInt(nums[i+1]);
            } else {
                answer -= Integer.parseInt(nums[i+1]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var result = solution.solution("3 + 4");
        System.out.println(result);
    }

}
