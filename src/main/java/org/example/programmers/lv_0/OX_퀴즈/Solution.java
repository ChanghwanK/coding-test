package org.example.programmers.lv_0.OX_퀴즈;

import java.util.Arrays;

public class Solution {
    public String[] solution(String[] quizs) {
        String[] answer = new String[quizs.length];
        for(int i = 0; i < quizs.length; i++) {
            String quiz = quizs[i];
            if(getAnswer(quiz)) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        return answer;
    }

    private boolean getAnswer(String quiz) {
        String [] str = quiz.replace(" ", "").split("=");
        String numOperation = str[0];
        int result = Integer.parseInt(str[1]);

        if(numOperation.contains("+")) {
            String[] split = numOperation.split("\\+");
            int num1 = Integer.parseInt(split[0]);
            int num2 = Integer.parseInt(split[1]);
            return result == num1 + num2;
        } else if (numOperation.contains("-")) {
            String[] split = numOperation.split("\\-");
            int num1;
            int num2;
            if(split[0].equals("")) {
                num1 = -1 * Integer.parseInt(split[1]);
                num2 = Integer.parseInt(split[2]);
            } else {
                num1 = Integer.parseInt(split[0]);
                num2 = Integer.parseInt(split[1]);
            }

            return result == num1 - num2;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        var data = solution.solution(new String[] {"3 - 4 = -3", "5 + 6 = 11"});
        System.out.println(Arrays.toString(data));
        var data2 = solution.solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"});
        System.out.println();
        System.out.println("결과");
        System.out.println(Arrays.toString(data2));
    }

}
