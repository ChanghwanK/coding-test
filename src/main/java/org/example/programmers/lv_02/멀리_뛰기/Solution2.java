package org.example.programmers.lv_02.멀리_뛰기;

public class Solution2 {
    // 정답 코드
    public long solution(int n) {
        long [] caseCount = new long[2001];

        caseCount[1] = 1;
        caseCount[2] = 2;

        // dp[n] = dp[n-1] + dp[n-2]

        for (int i = 3; i < 2001; i++) {
            caseCount[i] = (caseCount[i-1] + caseCount[i-2]) % 1234567;
        }

        return caseCount[n];
    }



    public static void main(String [] args) {

        Solution solution = new Solution();
        var result = solution.solution(4);
        System.out.println("result: " + result);
    }

}
