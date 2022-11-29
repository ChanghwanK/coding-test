package org.example.programmers.lv_01.소수_찾기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <=n ; i++) {
            if(isPrime(i)) answer++;
        }
        return answer;
    }

    public boolean isPrime(int n) {
        for(int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(10);
        System.out.println("result: " + result);
    }
}
