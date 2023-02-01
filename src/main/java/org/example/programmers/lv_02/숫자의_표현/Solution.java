package org.example.programmers.lv_02.숫자의_표현;

public class Solution {
    int ans = 0;
    public int solution(int n) {
        for(int i = 1; i <= n; i++) {
            int sum = 0;
            for(int j = i; j <= n; j++) {
                sum += j;
                if(sum == n) {
                    ans++;
                }else if(sum > n) {
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(15);
        System.out.println("result: " + result);
    }
}
