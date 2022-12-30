package org.example.programmers.lv_02.소수찾기;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    static Set<Integer> comb = new HashSet<>();
    static String [] strs;
    static boolean [] visit;

    void searchCombo(String num, int index) {
        if(!num.equals("")) {
            comb.add(Integer.valueOf(num));
        }


        if (index == strs.length) return;

        for(int i = 0; i < strs.length; i++) {
            if (visit[i]) continue;
            visit[i] = true;
            searchCombo(num + strs[i], index + 1);
            visit[i] = false;
        }
    }

    public boolean isPrime(int num) {
        if (num == 0 || num == 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) return false;

        return true;
    }

    public int solution(String numbers) {
        int answer = 0;

        strs = new String[numbers.length()];
        visit = new boolean[numbers.length()];

        for(int i = 0; i < numbers.length(); i++)
            strs[i] = String.valueOf(numbers.charAt(i));

        searchCombo("", 0);

        System.out.println(comb);

        for(Integer integer : comb)
            if(isPrime(integer)) {
                System.out.println(integer);
                answer++;
            }


        return answer;
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        var result = solution.solution("17");
        System.out.println("result: " + result);
    }

}
