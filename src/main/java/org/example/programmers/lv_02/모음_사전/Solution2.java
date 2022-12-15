package org.example.programmers.lv_02.모음_사전;

public class Solution2 {
    int result = 0;
    boolean isEqual = false;

    public int solution(String word) {
        int answer;
        recursive(word, new StringBuilder(), new String[]{"A", "E", "I", "O", "U"});
        answer = result;
        return answer;
    }

    void recursive(String word, StringBuilder sb, String [] aeiou) {
        if(word.equals(sb.toString())) {
            isEqual = true;
            return;
        }

        if(sb.length() == 5) return;

        for(String s : aeiou) {
            sb.append(s);
            result += 1;
            recursive(word, sb, aeiou);
            if(isEqual)
                return;
            sb.delete(sb.length() - 1, sb.length());
        }
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        var result = solution.solution("AEO");
        System.out.println("result: " + result);
    }
}
