package org.example.programmers.자료구조_알고리즘_강의.H_Index;

import java.util.Arrays;

public class Solution2 {
    public int solution(int[] citations) {
        // 3, 0, 6, 1, 5
        Arrays.sort(citations);
        // 0, 1, 3, 5, 6
        // 0번 인덱스 이상은 5편
        // 1번 인덱스 이상은 4편
        // 2번 인덱스 이상은 3편
        // ....

        for(int i = 0; i < citations.length; i++) {
            int hIndex = citations.length - i;
            if(citations[i] >= hIndex) return hIndex;
        }

        return 0;
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        var result = solution.solution(new int[] {3, 0, 6, 1, 5});
        System.out.println("result: " + result);
    }
}
