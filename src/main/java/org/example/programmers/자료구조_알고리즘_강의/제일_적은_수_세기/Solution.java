package org.example.programmers.자료구조_알고리즘_강의.제일_적은_수_세기;

import java.util.*;

public class Solution {
    // 정렬해서 리턴하는 것이 아니기 때문에 이렇게 풀면 안됨
//    public int[] solution(int[] arr) {
//        if (arr.length == 1) return new int[] {-1};
//        List<Integer> list = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder())
//            .collect(Collectors.toList());
//
//        return list.subList(0, list.size() - 1).stream().mapToInt(Integer::intValue).toArray();
//    }

    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[] {-1};
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr)
            .filter(num -> num != min)
            .toArray();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new int[] {5,6,3,2,4,7});
//        var result = solution.solution(new int[] {10});
        System.out.println("result: " + Arrays.toString(result));
    }
}
