package org.example.programmers.자료구조_알고리즘_강의.로또_번호_검출기;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean solution(int[] lotto) {
        // 중복되지 않고 범위가 1 - 45 사이어야 한다.
        // 중복이 있다는 것은 Set으로 바꿨을 때 길이가 6이 아님
        boolean answer = true;
        Set<Integer> validLottoNumber = new HashSet<>();
        Set<Integer> inputLottoNumber = new HashSet<>();

        for(int num : lotto) {
            inputLottoNumber.add(num);
        }

        if(inputLottoNumber.size() != 6) return false;

        for(int i = 1; i < 46; i++) {
            validLottoNumber.add(i);
        }

        inputLottoNumber.removeAll(validLottoNumber);

        return inputLottoNumber.isEmpty();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        solution.solution(new int[] {4, 7, 32, 47, 22, 19});
    }

}
