package org.example.programmers.lv_0.두_수의_나눗셈;

public class Solution {

    /**
     * 자바에서 소수점을 찍을려면 double 형으로 바꿔줘야함
     */
    public int solution(int num1, int num2) {
        double myNum = (double) num1 / num2;
        int answer = (int) (myNum * 1000);
        return answer;
    }
}
