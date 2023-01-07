package org.example.programmers.lv_02.문자열_압축;

public class Solution {
    public int solution(String s) {
        int answer = s.length();
        StringBuilder sb = new StringBuilder();
        for(int zipSize = 2; zipSize <= s.length() / 2; zipSize++) {
            // zipSize 만큼 자르고 압축 가능하면 압축
            System.out.println("size: " + zipSize);
            for(int i = 0; i <= s.length() - zipSize; i+= zipSize) {
                String target = s.substring(i, i + zipSize);
                sb.append(compressString(target));
            }
            System.out.println(sb.toString());
        }


        return answer;
    }

    // aabbaccc
    // 2a2baccc
    String compressString(String target) {
        char prev = target.charAt(0);
        int cnt = 1;

        for(int i = 1; i < target.length() ; i++) {
            if (prev == target.charAt(i)) {
                cnt+=1;
            }
        }

        if (cnt == 1) return target;
        else {
            String s = String.valueOf(prev);
            return cnt + s;
        }
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("aabbaccc");
        System.out.println("result: " + result);
    }
}
