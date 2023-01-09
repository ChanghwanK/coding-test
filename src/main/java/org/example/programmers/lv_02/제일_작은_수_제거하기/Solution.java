package org.example.programmers.lv_02.제일_작은_수_제거하기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] {-1};
        }

        List<Integer> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for(int num : arr) {
            min = Math.min(num, min);
        }

        for(int num : arr) {
            if (num != min) ans.add(num);
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[] {4,3,2,1});
    }
}
