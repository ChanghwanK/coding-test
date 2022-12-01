package org.example.programmers.lv_01.수박수박;

public class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            if (i % 2 == 1) sb.append("수");
            else sb.append("박");
        }

        return sb.toString();
    }
}
