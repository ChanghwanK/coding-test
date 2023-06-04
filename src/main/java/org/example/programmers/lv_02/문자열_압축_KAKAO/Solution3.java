package org.example.programmers.lv_02.문자열_압축_KAKAO;

import java.util.ArrayList;
import java.util.List;

// 사이즈 별로 다 압축
// 사이즈 별로 압축한 것들 중 가장 짧은 길이를 찾음
public class Solution3 {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;

        for (int i = 1; i <= s.length() ; i++) {
            int compressedLength = compress(s, i);

            if (compressedLength < answer) {
                answer = compressedLength;
            }
        }

        return answer;
    }

    private int compress(String source, int size) {
        StringBuilder sb = new StringBuilder();
        String last = "";
        int cnt = 0;
        var data = split(source, size);
        for (String token : split(source, size)) {
            if (token.equals(last)) {
                cnt++;
            } else {

                if (cnt > 1) {
                    sb.append(cnt);
                }

                sb.append(last);
                last = token;
                cnt = 1;
            }
        }

        // 왜 이쪽으로 나오는 것이지?
        // 1씩 잘랐을 때 왜 여기에 CCC가 붙어있는 것이지?
        // 나머지가 다 equals 이면 else 문을 타지 않는다.

        // last를 넣는 이유
        // !last.equals(token) 이기 때문에
        // token을 넣으면 이전 값이 버려짐
        if (cnt > 1)
            sb.append(cnt);

        sb.append(last);

        return sb.length();
    }

    private List<String> split(String source, int size) {
        List<String> tokens = new ArrayList<>();
        for (int startIndex = 0; startIndex < source.length(); startIndex+=size) {
            int endIndex = startIndex + size;

            if (endIndex > source.length())
                endIndex = source.length();

            tokens.add(source.substring(startIndex, endIndex));
        }

        return tokens;
    }

    public static void main(String [] args) {
        Solution3 solution = new Solution3();
        var result = solution.solution("aabbaccc");
        System.out.println("result: " + result);
    }
}
