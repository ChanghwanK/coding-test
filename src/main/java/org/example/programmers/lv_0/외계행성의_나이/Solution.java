package org.example.programmers.lv_0.외계행성의_나이;

import java.util.Arrays;

public class Solution {
    public String solution(int age) {
        String data = Integer.toString(age);
        int [] arr = new int[data.length()]; // 1000까지 이기 때문에
        int i = 0;
        while( age != 0) {
            arr[i] = age % 10;
            age /= 10;
            i++;
        }
        StringBuffer sb = new StringBuffer();

        for(int j = arr.length -1; j >= 0; j--) {
            sb.append((char) (arr[j] + 97));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var data = solution.solution(100);
        System.out.println("result >>> " + data);
    }

}
