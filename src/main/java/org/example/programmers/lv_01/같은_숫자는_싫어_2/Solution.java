package org.example.programmers.lv_01.같은_숫자는_싫어_2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Solution {

    /**
     * 배열 arr이 주어짐
     * - 배열에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거
     *
     * why stack
     * - 연속으로 등장하는 것을 제거하는 것이니 마지막 값을 확인하면 됨
     * - 마지막 값과 현재 값이 같으면 pass하면 됨
     */
    public int[] solution(int []arr) {
        int[] answer = {};
        Deque<Integer> deque = new LinkedList<>();

        for(int curNum : arr) {
            try {
                int lastNum = deque.getLast();
                if(curNum == lastNum)
                    continue;
                deque.add(curNum);
            } catch(NoSuchElementException ex) {
                deque.add(curNum);
            }
        }

        return deque.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new int[] {1,1,3,3,0,1,1});
        System.out.println("result: " + result);
    }
}
