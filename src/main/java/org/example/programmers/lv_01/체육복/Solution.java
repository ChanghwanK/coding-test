package org.example.programmers.lv_01.체육복;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // Hash Set 만들기
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();

        for(int i : reserve)
            resSet.add(i);

        for(int i : lost) {
            if (resSet.contains(i))
                resSet.remove(i);
            else
                lostSet.add(i);
        }

        // 빌려주기
        for(int i : resSet) {
            if (lostSet.contains(i - 1))
                lostSet.remove(i - 1);
            else if (lostSet.contains(i + 1))
                lostSet.remove(i + 1);
        }

        return n - lostSet.size();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(5, new int[] {2,4}, new int[] {1,3,5});
//        var result = solution.solution(5, new int[] {2,4}, new int[] {3});
        System.out.println("result: " + result);
    }
}
