package org.example.programmers.lv_0.모음_제거;

public class Solution {
    static char [] invalidWord = {'a', 'e', 'i', 'o', 'u'};
    public String solution(String my_string) {
        String answer = "";
//        String newWord = my_string.replaceAll(" ", "");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++) {
            char word = my_string.charAt(i);
            if(isContain(word)) continue;
            else sb.append(word);
        }
        answer = sb.toString();
        return answer;
    }

    private boolean isContain(char word) {
        for(int i = 0; i < invalidWord.length; i++) {
            if(word == invalidWord[i]) return true;
        }
        return false;
    }
    public static void main(String[] args) {

    }

}
