package org.example.programmers.lv_0.편지;

public class Solution {
    public int solution(String message) {
        int answer = 0;
        System.out.println(message.length());
        return message.length() * 2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var data = solution.solution("happy birthday!");
        var data2 = solution.solution("I love you~");
        System.out.println(data);
    }

}
