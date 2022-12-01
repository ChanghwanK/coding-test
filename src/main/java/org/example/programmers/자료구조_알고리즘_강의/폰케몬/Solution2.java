package org.example.programmers.자료구조_알고리즘_강의.폰케몬;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    // n/2마리 가져가도 됨
    // return
    // - 가장 많은 종류의 폰켓몬을 선택하는 방법
    // - 그때의 폰켓몬 종류 번호의 개수를 return 하도록 solution 함수를 완성해주세요.
    // 내가 잘못한 점
    public int solution(int[] nums) {
        // 3,1,2,3
        int availableCnt = nums.length / 2;

        Set<Integer> a = new HashSet<>();

        for(int i : nums) {
            a.add(i);
        }

        int size = a.size();

        return Math.min(size, availableCnt);

    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new int[] {3,1,2,3});
        System.out.println("result: " + result);
    }

}
