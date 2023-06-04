package org.example.programmers.lv_01.카드_뭉치;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    /**
     * what
     * - 다음과 같은 규칙으로 카드에 적힌 단어들을 사용해 원하는 순서의 단어 배열을 만들 수 있는지 알고 싶습니다.
     */
    /**
     * 규칙
     * 원하는 카드 뭉치에서 카드를 순서대로 한 장씩 사용합니다.
     * 한 번 사용한 카드는 다시 사용할 수 없습니다.
     * 카드를 사용하지 않고 다음 카드로 넘어갈 수 없습니다.
     * 기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없습니다.
     */
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue<String> cardOneQueue = new LinkedList<>();
        Queue<String> cardTwoQueue = new LinkedList<>();
        Queue<String> goalQueue = new LinkedList<>();

        for (String item : goal) {
            goalQueue.offer(item);
        }

        for (String value : cards1) {
            cardOneQueue.offer(value);
        }

        for (String s : cards2) {
            cardTwoQueue.offer(s);
        }

        while (! goalQueue.isEmpty()) {
            String cur = goalQueue.poll();
            if (cardOneQueue.contains(cur)) {
                if (! cardOneQueue.poll().equals(cur)) {
                    answer = "No";
                    return answer;
                }
            } else {
                if (! cardTwoQueue.poll().equals(cur)) {
                    answer = "No";
                    return answer;
                }
            }
        }

        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(
            new String[] {"i", "drink", "water"},
            new String[] {"want", "to"},
            new String[] {"i", "want", "to", "drink", "water"}
        );
        System.out.println("result: " + result);
    }
}
