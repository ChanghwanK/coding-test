package org.example.programmers.lv_0.k_의_개수;

public class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int l = i; l <=j ; l++) {
            String temp = String.valueOf(l);
            if (temp.contains(String.valueOf(k))){
                answer += howMany(temp, k);
            }
        }
        return answer;
    }

    private int howMany(String num, int k) {
        System.out.println("num: " + num);
        int cnt = 0;
        for(int i = 0; i < num.length(); i++) {
            int a = Character.getNumericValue(num.charAt(i));
            if (a == k)  cnt ++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var result = solution.solution(1, 13, 1);
        System.out.println(result);
    }
}
