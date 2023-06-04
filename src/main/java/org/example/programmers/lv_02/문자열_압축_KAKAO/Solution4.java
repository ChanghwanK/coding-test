package org.example.programmers.lv_02.문자열_압축_KAKAO;

import java.util.ArrayList;
import java.util.List;

public class Solution4 {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;

        for (int i = 1; i < s.length() ; i++) {
            int res = compress(s, i);

            if (answer > res) {
                answer = res;
            }
        }

        return answer;
    }

    private int compress(final String source, int size) {
        int cnt = 0;
        String last = "";
        StringBuilder sb = new StringBuilder();

        for (String token : split(source, size)) {
            if (token.equals(last)) {
                cnt++;
            } else {
                if (cnt > 1)
                    sb.append(cnt);

                sb.append(last);
                last = token;
                cnt = 1;
            }
        }

        if (cnt > 1) {
            sb.append(cnt);
        }

        sb.append(last);
        return sb.length();
    }

    private List<String> split(final String source, final int size) {
        List<String> tokens = new ArrayList<>();

        for (int startIndex = 0; startIndex < source.length(); startIndex+= size) {
            int endIndex = startIndex + size;

            if (endIndex > source.length())
                endIndex = source.length();

            tokens.add(source.substring(startIndex, endIndex));
        }

        return tokens;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("ababcdcdababcdcd");
        System.out.println("result: " + result);
    }
}
