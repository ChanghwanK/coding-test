package org.example.programmers.lv_02.소수찾기;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    static Set<Integer> numberSet = new HashSet<>();

    public boolean isPrime(int num) {

        if(num == 0 || num == 1)  return false;

        int limit =  (int) Math.sqrt(num);

        for(int i = 2; i <= limit ; i++)
            if (num % i == 0) return false;

        return true;
    }

    public void recursive(String comb, String others) {
        // 숫자 넣기
        if(!comb.equals(""))
            numberSet.add(Integer.parseInt(comb));

        for(int i = 0; i < others.length(); i++) {
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }
    }

    public int solution(String numbers) {
        int answer = 0;

        recursive("", numbers);
        Iterator<Integer> iterator = numberSet.iterator();

        while(iterator.hasNext()) {
            int num = iterator.next();
            if (isPrime(num)) answer ++;
        }

        return answer;
    }
    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("17");
        System.out.println("result: " + result);
    }
}
