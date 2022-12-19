package org.example.programmers.lv_02.타겟_넘버;

class Solution {
    static int ans;

    public int solution(int[] numbers, int target) {
        dfs(0, numbers, target);
        return ans;
    }

    void dfs(int index, final int [] numbers, int target) {
        if (index == numbers.length) return;

        int total = numbers[index];

        // 더 해본다.
        for(int i = 0; i < numbers.length; i++) {
            if (i == index) continue;
            total += numbers[i];
        }

        if (total == target) {
            ans++;
        }

        total = (-1 * numbers[index]);

        // 빼본다.
        for(int i = 0; i < numbers.length; i++) {
            if (i == index) continue;
            total += numbers[i];
        }

        if (total == target) {
            ans++;
        }

        dfs(index + 1, numbers, target);
    }


    public static void main(String [] args) {
        Solution solution = new Solution();
//        int [] numbers = new int[] {1,1,1,1, 1};
        int [] numbers = new int[] {4, 1, 2, 1};
        int target = 4;

        var result = solution.solution(numbers, target);
        System.out.println("result: " + result);
    }
}
