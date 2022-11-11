package org.example.programmers.lv_0.모스부호;

import java.util.HashMap;

public class Solution {
    public static final HashMap<String, String> MORSE = new HashMap<>() {
        {
            put(".-", "a");
            put("-...", "b");
            put("-.-.", "c");
            put("-..", "d");
            put(".", "e");
            put("..-.", "f");
            put("--.", "g");
            put("....", "h");
            put("..", "i");
            put(".---", "j");
            put("-.-", "k");
            put(".-..", "l");
            put("--", "m");
            put("-.", "n");
            put("---", "o");
            put(".--.", "p");
            put("--.-", "q");
            put(".-.", "r");
            put("...", "s");
            put("-", "t");
            put("..-", "u");
            put("...-", "v");
            put(".--", "w");
            put("-..-", "x");
            put("-.--", "y");
            put("--..", "z");
        }
    };

    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        String [] letters = letter.split(" ");
        for(String word : letters) {
            answer.append(MORSE.get(word));
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";
        String letter2 = ".--. -.-- - .... --- -.";
        Solution solution = new Solution();
        String result = solution.solution(letter);
        System.out.println("Result >>> " + result);
    }
}
