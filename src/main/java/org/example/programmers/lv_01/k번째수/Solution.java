package org.example.programmers.lv_01.k번째수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = Arrays.stream(array)
            .boxed()
            .collect(Collectors.toList());

        List<Integer> ans = new ArrayList<>();

        for(int [] command : commands) {
            int startIdx = command[0] - 1;
            int endIdx = command[1];
            int index = command[2] - 1;

            // 부모 List가 영향을 받기 때문에 새로운 ArrayList로 받기
            List<Integer> tempList = new ArrayList<>(list.subList(startIdx, endIdx));
            Collections.sort(tempList);
            ans.add(tempList.get(index));
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(
            new int[] {1,5,2,6,3,7,4},
            new int[][] {{2,5,3}, {4,4,1}, {1,7,3}}
        );
        System.out.println("result: " + Arrays.toString(result));
    }
}
