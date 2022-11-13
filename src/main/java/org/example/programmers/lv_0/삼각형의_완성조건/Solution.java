package org.example.programmers.lv_0.삼각형의_완성조건;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    /**
     * 삼각형 조건
     *  - 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
     *   max < sum
     *  - 만들 수 있음 1 없으면 2
     */
    public int solution(int[] sides) {
        int max = Integer.MIN_VALUE;
        Arrays.sort(sides);

        if (sides[2] < sides[0] + sides[1]) return 1;
        else return 2;
    }

    public static void main(String[] args) {
        int [] a = new int[] {1,2,3};
        int [] b = new int[] {3, 6, 2};
        int [] c = new int[] {199, 72, 222};
        Solution solution = new Solution();

        var result = solution.solution(a);
    }

}
