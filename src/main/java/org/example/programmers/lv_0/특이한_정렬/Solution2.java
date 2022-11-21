package org.example.programmers.lv_0.특이한_정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution2 {
    public int[] solution(int[] numlist, int n) {
        List<Integer> ls = IntStream.of(numlist).boxed().collect(Collectors.toList());
        ls.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int o1Distance = Math.abs(o1 - n);
                int o2Distance = Math.abs(o2 - n);

                if(o1Distance == o2Distance) {
                    if(o1 > o2) {
                        return -1;
                    } else if(o1 < o2) {
                        return 1;
                    }
                } else {
                    return o1Distance - o2Distance;
                }
                return 0;
            }
        });

        return ls.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int [] numList = new int[] {1,2,3,4,5,6};
        Solution2 solution = new Solution2();
        System.out.println("result: " + Arrays.toString(solution.solution(numList, 4)));;
    }

}
