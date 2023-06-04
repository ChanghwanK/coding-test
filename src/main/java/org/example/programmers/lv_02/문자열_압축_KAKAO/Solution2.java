package org.example.programmers.lv_02.문자열_압축_KAKAO;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;

        // 압축 해보고 길이를 갱신

        for (int i = 1; i <= s.length() ; i++) {
            int compressedLength = compress(s, i);

            if (compressedLength < answer)
                answer = compressedLength;
        }

        return answer;
    }

    private int compress(String source, int compressSize) {
        StringBuilder sb = new StringBuilder();

        String last = "";
        int cnt = 0;

        for (String token : split(source, compressSize)) {
            if (token.equals(last)) {
                cnt++;
            } else {

                if (cnt > 1)
                    sb.append(cnt);

                sb.append(token);
                last = token;
            }
        }

        return sb.length();
    }

    private List<String> split(String source, int compressSize) {
        List<String> tokens = new ArrayList<>();

        for (int startIndex = 0; startIndex < source.length(); startIndex+=compressSize) {
            int endIndex = startIndex + compressSize;

            if (endIndex > source.length()) {
                endIndex = source.length();
            }

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
