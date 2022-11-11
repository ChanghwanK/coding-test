package org.example.programmers.lv_0.구술을_나누는_경우의_수;

import java.math.BigInteger;

public class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger temp1 = BigInteger.valueOf(1);
        BigInteger temp2 = BigInteger.valueOf(1);

        for(int i = 0; i < share; i++) {
            temp1 = temp1.multiply(BigInteger.valueOf(balls - i));
        }

        for(int i = share; i >= 1 ; i--) {
            temp2 = temp2.multiply(BigInteger.valueOf(i));
        }

        return temp1.divide(temp2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        BigInteger result = solution.solution(5,3);
        System.out.println("result: " + result);
    }

}
