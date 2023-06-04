package org.example.programmers.lv_02.타겟넘버;

public class Solution2 {
    private int ans;
    private int [] numbers;

    private void sum(int index, int target, int currentValue) {
        if (index == numbers.length) {
            if (currentValue == target) {
                ans++;
            }
            return;
        }

        sum(index + 1, target, currentValue + numbers[index]);
        sum(index + 1, target, currentValue - numbers[index]);
    }

    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        sum(0, target, 0);
        return ans;
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        var result = solution.solution(new int[] {1,1,1,1,1}, 3);
        System.out.println("result: " + result);
    }
}
