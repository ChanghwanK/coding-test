package org.example.programmers.lv_0.개미군단;

public class Solution {
    public int solution(int hp) {
        int answer = 0;
        int [] temp = new int[] {5,3,1};

        for(int i = 0; i < 3; i++) {
            answer += (hp / temp[i]);
            hp = hp % temp[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var data = solution.solution(999);
        System.out.println("result = " + data);
    }

}
