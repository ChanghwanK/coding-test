package org.example.programmers.lv_0.특이한_정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution3 {
    public int[] solution(int[] numlist, int n) {
        List<Integer> ls = IntStream.of(numlist).boxed().collect(Collectors.toList());
        return ls.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int [] numList = new int[] {1,2,3,4,5,6};
        Solution3 solution = new Solution3();
        System.out.println("result: " + Arrays.toString(solution.solution(numList, 4)));;
    }

}
