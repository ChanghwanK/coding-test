package org.example.programmers.lv_0.점의_위치_구하기;

public class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];

        if (x > 0 && y > 0) {
            answer = 1;
        } else if(x > 0 && y < 0) {
            answer = 4;
        } else if (x < 0 && y > 0) {
            answer = 2;
        } else if(x < 0 && y < 0) {
            answer =3;
        }
        return answer;
    }

    public static void main(String[] args) {
        int [] data = new int[] {2, 4};
        int [] data2 = new int[] {-7, 9};
        Solution solution = new Solution();
        System.out.println("result1: " + solution.solution(data));
        System.out.println("result2: " + solution.solution(data2));
    }
}
