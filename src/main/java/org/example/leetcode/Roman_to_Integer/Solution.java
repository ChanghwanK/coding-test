package org.example.leetcode.Roman_to_Integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     */
    public int romanToInt(String s) {
        Map<Character, Integer> romanNumberMap = new HashMap<>();
        romanNumberMap.put('I', 1);
        romanNumberMap.put('V', 5);
        romanNumberMap.put('X', 10);
        romanNumberMap.put('L', 50);
        romanNumberMap.put('C', 100);
        romanNumberMap.put('D', 500);
        romanNumberMap.put('M', 1000);

        /**
         * 이전 글자 값이 더 작은 경우를 고려해야 함
         *   - 이전 글자 값이 더 작을 경우 현재 값에서 이전 값을 빼야함
         *   - 한칸씩 옮기면서 두개씩 봐야함
         *   - 따라서 9와 같은 것은 계산된 것이니 두 칸 이동해야 함
         *   ex) IV, CM
         */
        int ans = 0;
        int nextCheckPosition = 0;  // 처음은 0버부터 시작

        while (nextCheckPosition >= 0) {
            if (nextCheckPosition == s.length() || nextCheckPosition == s.length() - 1)
                break;

            String subed = s.substring(nextCheckPosition, nextCheckPosition + 2);

            int first = romanNumberMap.get(subed.charAt(0));
            int second = romanNumberMap.get(subed.charAt(1));

            int resultValue = first;

            if (first < second) {
                resultValue = (second - first);
                ans += resultValue;
                nextCheckPosition += 2;
                continue;
            }

            ans += resultValue;
            nextCheckPosition += 1;
        }

        if (! (nextCheckPosition == s.length())) {
            ans += romanNumberMap.get(s.charAt(s.length() - 1));
        }



        return ans;
    }

    private static Map<Character, Integer> m = new HashMap<>();
    static {
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
    }

    /**
     * 로마 숫자 계산 팁
     *  - 이전 값이 더 작을 경우  =  현재까지 누적된 값 + 현재의 값 - 이전 값을 2번 빼준다.
     */
    public int romanToInt2(String s) {
        char[] c = s.toCharArray();

        int sum = 0;

        for (int i=0; i<c.length; i++) {
            // if previous number is greater than current
            // it means we need to subtract the previous number

            // 만약 현재 캐릭터 값이 바로 전 캐릭터 값보다 더 크면 스페셜 컨디션으로써 바로 전 캐릭터 값을 두 번 빼준다.
            if (i > 0 && m.get(c[i]) > m.get(c[i-1])) {
                sum += m.get(c[i]) - 2*m.get(c[i-1]);
            } else {
                // 그 외에 경우엔 sum에 바로 더해준다.
                sum += m.get(c[i]);
            }
        }

        return sum;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.romanToInt2("MCMXCIV");
//        var result = solution.romanToInt2("III");
        System.out.println("result: " + result);
    }

}
