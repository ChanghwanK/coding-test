package org.example.programmers.자료구조_알고리즘_강의.같은_숫자는_싫어;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new LinkedList<>();
        Set<Integer> arr1 = new LinkedHashSet<>();
        arr1.add(2);
        int index = -1;
        for(int num : arr) {
            if(index == - 1) {
                list.add(num);
                index++;
            } else {
                if(list.get(index) != num) {
                    list.add(num);
                    index++;
                }
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        solution.solution(new int[] {1,1,3,3,0,1,1});
    }
}
