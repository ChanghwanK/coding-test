package org.example.programmers.lv_0.옹알이;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *  replace로 "" 다 바꿀꺼임 더 이상 바꿀 수 없을 때까지 반복
 */
public class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        ArrayList<String> enableBabblings = new ArrayList<>();
        enableBabblings.add("aya");
        enableBabblings.add("ye");
        enableBabblings.add("woo");
        enableBabblings.add("ma");

        ArrayList<String> requestedBabblingList = new ArrayList<>(Arrays.asList(babbling));

        for (String enableBabbling : enableBabblings) {
            for (int i = 0; i < requestedBabblingList.size(); i++) {
                String requestedBabbling = requestedBabblingList.get(i);
                if (requestedBabbling.contains(enableBabbling)) {
                    requestedBabblingList.set(i, requestedBabbling.replace(enableBabbling, "."));
                }
            }
        }

        for (String requestedBabbling : requestedBabblingList) {
            if (requestedBabbling.equals(".")) answer++;
            if (requestedBabbling.equals("..")) answer++;
            if (requestedBabbling.equals("...")) answer++;
            if (requestedBabbling.equals("....")) answer++;
        }

        return answer;
    }


    public static void main(String[] args) {
        String [] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        String [] babbling2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        Solution solution = new Solution();
        int result = solution.solution(babbling);
        System.out.println("Result: "   + result);
    }
}
