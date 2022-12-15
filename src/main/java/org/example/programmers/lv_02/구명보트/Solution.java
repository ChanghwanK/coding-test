package org.example.programmers.lv_02.구명보트;

import java.util.Arrays;

public class Solution {
    // 제약조건 최대 2명 과 limit가 존재함
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int index = 0;

        for (int i = people.length - 1; i >= index; i--) {
            if (people[i] + people[index] <= limit) {
                index++;
                answer++;
            }
            else {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new int[]{70, 50, 80, 50}, 100);
        System.out.println("result: " + result);
    }
}
