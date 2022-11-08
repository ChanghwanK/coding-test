package org.example.programmers.lv_0.짝수_홀수_개수;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list) {
        int a = 0;
        int b = 0;

        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                a++;
            } else {
                b++;
            }
        }

        return new int[] {a, b};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var data = solution.solution(new int[] {1,2,3,4,5});
        System.out.println("Result: " + Arrays.toString(data));
    }
}
