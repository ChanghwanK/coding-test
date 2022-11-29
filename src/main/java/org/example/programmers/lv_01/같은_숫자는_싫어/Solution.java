package org.example.programmers.lv_01.같은_숫자는_싫어;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        // 1,1,3,3,0,1,1

        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        int index = 1;
        for(int a : arr) {
            if(a != list.get(index-1)) {
                list.add(a);
                index++;
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new int[] {1,1,3,3,0,1,1});
        System.out.println("result: " + result);
    }
}
