package org.example.programmers.lv_02.연속_부분_수열_합의_개수;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] elements) {
        // 배열 길이를 2배로 초기화
        List<Integer> arr = Arrays.stream(elements).boxed().collect(Collectors.toList());
        arr.addAll(Arrays.stream(elements).boxed().collect(Collectors.toList()));

        // 중복 제거를 위해 Set 사용
        // 배열을 자르고 그 합을 set에 저장
        Set<Integer> resultSet = new HashSet<>();
        for(int i = 1; i <= elements.length ; i++) {
            for(int j = 0; j < elements.length; j++) {
                resultSet.add(arr.subList(j, j + i).stream().mapToInt(Integer::intValue).sum());
            }
        }
        return resultSet.size();
    }


    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new int[] {7,9,1,1,4});
        System.out.println("result: " + result);
    }
}
