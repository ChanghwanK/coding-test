package org.example.programmers.자료구조_알고리즘_강의.타겟_넘버;

public class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        boolean [] visit = new boolean[numbers.length];
        dfs(numbers, target, 0, 0);
        return answer;
    }

    /**
     * total에 누적 시키는 방법은 numbers를 다 소모하지 않고도 target이 될 수 있음
     * 조건
     * - numbers를 다 소모했을 때의 결과가 target과 동일한지
     */
    void dfs(int[] numbers, int target, int total, int idx) {
        if (idx == numbers.length) {
            if (total == target) answer++;
            return;
        }

        dfs(numbers, target, total + numbers[idx], idx + 1);
        dfs(numbers, target, total - numbers[idx], idx + 1);
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        int [] numbers = {1,1,1,1,1};
        var result = solution.solution(numbers, 3);
        System.out.println("result: " + result);
    }
}
