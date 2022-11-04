package org.example.programmers.lv_0.각도기;

public class Solution {
    public int solution(int angle) {
        int answer = 1;
        if (angle == 180) {
            answer = 4;
        } else if (90 < angle) {
            answer = 3;
        } else if (90 == angle) {
            answer = 2;
        }
        return answer;
    }
    public static void main(String[] args) {

    }
}
