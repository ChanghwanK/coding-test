package org.example.programmers.lv_01.약수의_합;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int n) {
        List<Integer> arr = new ArrayList<>();

        for(int i = 1; i <= n ; i++) {
            if(n % i == 0) arr.add(i);
        }
        return arr.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(12);
        System.out.println("result: " + result);
    }
}
