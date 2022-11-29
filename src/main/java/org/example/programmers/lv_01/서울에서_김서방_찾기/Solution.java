package org.example.programmers.lv_01.서울에서_김서방_찾기;

public class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int position = 0;
        for(String name : seoul) {
            if(name.equals("Kim")) break;
            position++;
        }
        return "김서방은 " + position + "에 있다";
    }
    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new String[]{"Jane", "Kim"});
        System.out.println("result: " + result);
    }
}
