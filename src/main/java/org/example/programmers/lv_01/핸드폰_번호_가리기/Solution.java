package org.example.programmers.lv_01.핸드폰_번호_가리기;

public class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length() - 4;
        String subedPhoneNumber = phone_number.substring(len);

        StringBuilder sb = new StringBuilder();
        sb.append("*".repeat(len));
        sb.append(subedPhoneNumber);
        return sb.toString();
    }
    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("01033334444");
        System.out.println("result: " + result);
    }
}
