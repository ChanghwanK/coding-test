package org.example.programmers.lv_01.둘만의_암호;

/**
 * 규칙
 * - 문자열 s의 각 알파벳을 index만큼 뒤의 알파벳으로 바꿔줍니다.
 * - index만큼의 뒤의 알파벳이 z를 넘어갈 경우 다시 a로 돌아갑니다.
 * - skip에 있는 알파벳은 제외하고 건너뜁니다.
 */
public class Solution {
    private static String WORDS = "abcdefghijklmnopqrstuvwxyz";
    private static char [] CHARS = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public String solution(String s, String skip, int index) {
        String answer = "";

        for (char c : s.toCharArray()) {
            int c_index = WORDS.indexOf(c);
            int nextIndex = c_index + 1;
            // 증가 횟수
            int incr = 0;
            while (true) {
                if (nextIndex > WORDS.length() - 1)
                    nextIndex = 0;

                char next = CHARS[nextIndex++];

                if (skip.indexOf(next) == - 1) {
                    incr ++;
                }


                if (incr == index) {
                    answer+=next;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("aukks", "wbqd", 5);
        System.out.println("result: " + result);
    }
}
