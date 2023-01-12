package org.example.programmers.lv_02.가장_큰수;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution2 {
    public String solution(int[] numbers) {
        // 앞자리가 큰 수로 정렬
        String [] nums = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++)
            nums[i] = String.valueOf(numbers[i]);


        String ans = Arrays.stream(nums)
            .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
            .collect(Collectors.joining());

        if(ans.startsWith("0")) return "0";
        return ans;
    }
}
