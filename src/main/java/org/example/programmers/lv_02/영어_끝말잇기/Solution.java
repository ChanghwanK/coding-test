package org.example.programmers.lv_02.영어_끝말잇기;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    Stack<String> wordsStack = new Stack<>();

    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        for (String word : words) {
            if(wordsStack.isEmpty()) {
                wordsStack.push(word);
            } else {
                if (wordsStack.contains(word) || !isValid(word)) {
                    answer[0] = (wordsStack.size() % n) + 1;
                    answer[1] =  (wordsStack.size() / n) + 1;
                    return answer;
                }

                wordsStack.push(word);
            }
        }

        return answer;
    }

    boolean isValid(String word) {
        String latestWord = wordsStack.peek();
        return word.startsWith(String.valueOf(latestWord.charAt(latestWord.length() - 1)));
    }

    public static void main(String [] args) {
        Solution solution = new Solution();

//        var result = solution.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
//        var result = solution.solution(3, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});
        var result = solution.solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});

        System.out.println("result: " + Arrays.toString(result));
    }
}
