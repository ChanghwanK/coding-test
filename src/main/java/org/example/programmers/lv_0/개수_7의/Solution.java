package org.example.programmers.lv_0.개수_7의;

public class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            answer += sevenCounter(String.valueOf(array[i]));
        }

        return answer;
    }

    private int sevenCounter(String num) {
        int cnt = 0;
        for(int i = 0; i < num.length(); i++) {
            char a = num.charAt(i);
            int numericValue = Character.getNumericValue(a);
            if(numericValue != 0 && numericValue % 7 == 0) {
                cnt ++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
//        int [] arr = new int[] {7,77,17};
        int [] arr = new int[] {10,29};
        Solution solution = new Solution();
        System.out.println("result: " + solution.solution(arr));
    }

}
