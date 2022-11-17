package org.example.programmers.lv_0.삼각형의_완성조건_2;


import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 *  삼각형
 *  - 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.  => maxLength < sideOneLen + sideTwoLen
 *  1. 주어진 sides의 길이가 가장 긴 경우
 *      - 가장 작은 길이보다 크면서 가장 긴 변의 길이까지 (3,6) => 4,5,6
 *  2. 나머지 한 변이 가장 긴 경우
 *      - 나머지가 가장 긴 경우는 11 + 7  - 1까지 가능함
 */
public class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        HashSet<Integer> arr = new LinkedHashSet<>();

        // sides에 주어진 길이가 가장 긴 값인 경우
        int maxLenInSides = Math.max(sides[0], sides[1]);
        int minLenInSides = Math.min(sides[0], sides[1]);
        int another = 0;

        for(int i = 1; i <= maxLenInSides; i++) {
            if(maxLenInSides < minLenInSides + i) {
               arr.add(i);
            }
        }

//      다른 한 변의 길이가 가장 긴 경우
        for(int i = maxLenInSides; i < maxLenInSides + minLenInSides; i++) {
            arr.add(i);
        }

        answer = arr.size();
        return answer;
    }

    public static void main(String[] args) {
//        int [] sides = new int[] {3,6};
//        int [] sides = new int[] {1,2};
        int [] sides = new int[] {11,7};
        Solution solution = new Solution();
        System.out.println("result: " + solution.solution(sides));
    }

}
