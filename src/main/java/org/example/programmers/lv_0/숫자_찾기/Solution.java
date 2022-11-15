package org.example.programmers.lv_0.숫자_찾기;

public class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String strNum = String.valueOf(num);

        for(int i = 0; i < strNum.length(); i++) {
            var data = Integer.parseInt(String.valueOf(strNum.charAt(i)));
            if(data == k) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int num1 = 29183;
        int k = 1;
        Solution solution = new Solution();
        System.out.println(solution.solution(num1, k));
    }

}
