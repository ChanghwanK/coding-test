package org.example.programmers.lv_0.영어가_싫어요;

import java.util.ArrayList;

public class Solution {
    public long solution(String numbers) {
        long answer = 0;
        StringBuilder sb = new StringBuilder();
        String [] numWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < 10; i++) {
            if(numbers.contains(numWords[i])) {
                String s = numbers.replaceAll(numWords[i], String.valueOf(i));
                numbers = s;
            }
        }
        answer = Long.parseLong(numbers);
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var data = solution.solution("onetwothreefourfivesixseveneightnine");
        System.out.println(data);
        System.out.println();
        var data2 = solution.solution("onefourzerosixseven");
        System.out.println(data2);
        System.out.println();
        var data3 = solution.solution("onezerozero");
        System.out.println(data3);

    }

}
