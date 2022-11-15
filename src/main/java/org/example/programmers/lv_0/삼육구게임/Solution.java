package org.example.programmers.lv_0.삼육구게임;

public class Solution {
    public int solution(int order) {
        int answer = 0;
        String strOrder = String.valueOf(order);

        for(int i = 0; i < strOrder.length(); i++) {
            char a = strOrder.charAt(i);
            System.out.println(a);
            if( strOrder.charAt(i) != '0' && strOrder.charAt(i) % 3 == 0){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int testCase1 = 3;
        int testCase2 = 29423;
        Solution solution = new Solution();
        var result = solution.solution(1000000);
        System.out.println(result);
    }

}
