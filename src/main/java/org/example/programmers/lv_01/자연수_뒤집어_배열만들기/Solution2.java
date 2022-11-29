package org.example.programmers.lv_01.자연수_뒤집어_배열만들기;

import java.util.Arrays;

public class Solution2 {
//    public int[] solution(long n) {
//        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
//    }
    public int[] solution(long n) {
        return new StringBuilder(String.valueOf(n)).reverse().chars().map(Character::getNumericValue).toArray();
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        var result = solution.solution(12345);
        System.out.println("result: " + Arrays.toString(result));
    }
}
