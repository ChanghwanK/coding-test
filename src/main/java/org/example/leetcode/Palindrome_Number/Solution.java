package org.example.leetcode.Palindrome_Number;

public class Solution {

    public boolean isPalindrome(int x) {
        boolean res = true;
        String number = String.valueOf(x);
        int numberLength = number.length();

        for (int i = 0; i < numberLength / 2; i ++) {
            int start = i;
            // 12345
            //
            int end = numberLength -start - 1;

            if (! (number.charAt(start) == number.charAt(end))) {
                return false;
            }
        }


        return res;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.isPalindrome(11);
        System.out.println("result: " + result);
    }
}
