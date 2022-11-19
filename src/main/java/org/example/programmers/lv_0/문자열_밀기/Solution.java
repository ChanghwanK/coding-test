package org.example.programmers.lv_0.문자열_밀기;

import java.util.Arrays;

public class Solution {

    /**
     * 될 수 있다면 몇번을 밀어야 하는지
     * 될 수 없다면 -1
     */
    public int solution(String A, String B) {
        int answer = 0;
        // 안되는 경우
        // 1. 길이가 다름
        // 2. 알파벳 구성이 다름
        if (A.length() != B.length()) return -1;
        if(A.equals(B)) return 0;

        // 알파벳 구성 체크
        // 길이가 다르다면 이쪽으로 오지 못하기 때문에 IndexOutOfRange는 나오지 않을 것
        for(int i = 0; i < B.length(); i++) {
            if(A.indexOf(B.charAt(i)) == -1) return -1;
        }

        // 길이가 다르거나 알파벳 구성이 다르거나 하지는 않는 상태 즉, 가능상태
        // 하나씩 뒤로 미루며 같은지 체크한다.

        int cnt = 0; // 몇번 미는지
        while(cnt <= A.length()) {
            cnt++;
            if(B.equals(pushText(A))) {
                return cnt;
            } else {
                A = pushText(A);
            }
        }
        return -1;
    }

    private String pushText(String A) {
        char [] str = new char[A.length()];
        char temp = A.charAt(A.length() - 1); // 젤 앞으로 밀 문자
        str[0] = temp;
        for(int i = 0; i < A.length() - 1; i++) {
            char a = A.charAt(i);
            str[i+1] = a;
        }

//        System.out.println("밀고나서: " + Arrays.toString(str));
        return String.valueOf(str);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println("result: " + solution.solution("hello", "ohell"));
        System.out.println(solution.solution("apple", "elppa"));
    }
}
