package org.example.programmers.lv_02.문자열_압축_KAKAO;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(String s) {
        // 1 ~ s.length 만큼 잘라보고 압축 시킨 다음 가장 짧은 것을 리턴
        int answer = 0;
        // 1부터 문자열 s의 길이만큼 자를 문자열의 길이를 설정하며 반복
        int min = Integer.MAX_VALUE;

        for (int length = 1; length <= s.length(); length++) {
            int compressedLength = compress(s, length);

            if (compressedLength < min)
                min = compressedLength;
        }
        // 설정된 길이만큼 문자열을 잘라 낸 token 배열 생성
        // 문자열을 비교하며 token의 배열을 하나의 문자열로 압축
        // 1~3 과정으로 압축된 문자열 중 가장 짧은 길이 반환
        return min;
    }

    private int compress(String source, int length) {
        StringBuilder sb = new StringBuilder();
        String last = "";
        int count = 0;

        for (String token : split(source, length)) {
            if (token.equals(last)) {
                count++;
            } else {
                // 카운트가 1이면 붙이지 않아도 되니 생략하고 1보다 큰 경우만
                if (count > 1)
                    sb.append(count);

                sb.append(last);
                last = token;
                count = 1;
            }
        }

        if (count > 1)
            sb.append(count);
        sb.append(last);

        return sb.length();
    }

    private List<String> split(String source, int length) {
        List<String> tokens = new ArrayList<>();

        for (int startIndex = 0; startIndex < source.length(); startIndex+=length) {
            int endIndex = startIndex + length;

            // 계속 짜르다가 length만큼 늘어나면 source보다 길어질 것이기 때문에 그 경우는 끝길이로 설정
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
