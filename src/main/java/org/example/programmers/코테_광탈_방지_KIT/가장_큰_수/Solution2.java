package org.example.programmers.코테_광탈_방지_KIT.가장_큰_수;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution2 {
    public String solution(int[] numbers) {
        String answer = IntStream.of(numbers).mapToObj(String::valueOf).sorted(
            (s1, s2) -> (s2 + s1).compareTo(s1 + s2)
        ).collect(Collectors.joining());

        if (answer.startsWith("0")) return "0";

        return answer;
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        var result = solution.solution(new int[] {6,10,2});
        System.out.println("result: " + result);
    }
}
