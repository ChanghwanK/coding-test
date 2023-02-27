package org.example.programmers.lv_01.카드뭉치;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "No";
        List<String> cardOneBundle = List.of(cards1);
        List<String> cardTwoBundle = List.of(cards2);
        Queue<String> cardOneQueue = new LinkedList<>();
        Queue<String> cardTwoQueue = new LinkedList<>();

        for(String word : goal) {
            if(cardOneBundle.contains(word)) {
                cardOneQueue.add(word);
            }

            if(cardTwoBundle.contains(word)) {
                cardTwoQueue.add(word);
            }
        }

        if(cardOneBundle.equals(cardOneQueue) && cardTwoBundle.equals(cardTwoQueue) && (cardOneQueue.size() + cardTwoQueue.size() == goal.length)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new String[]{"i", "want", "drink"}, new String[]{"to", "water"}, new String[]{"i", "want", "to", "drink", "water"});
        System.out.println("result: " + result);
    }
}
