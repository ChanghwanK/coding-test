package org.example.programmers.summer_winter.소수_만들기;

public class Solution {

    public int solution(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) result++;
                }
            }
        }
        return result;
    }

    public boolean isPrime(int num) {
        System.out.println("num: " + num);
        for(int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
//        System.out.println(solution.isPrime(7));
//        var result = solution.solution(new int[]{1,2,3,4});
        var result = solution.solution(new int[]{1,2,7,6,4});
        System.out.println("result: " + result);
    }
}
