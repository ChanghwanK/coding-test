package org.example.programmers.lv_02.택배상자;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public int solution(int[] orders) {
        int answer = 0;

        Queue<Integer> mainBelt = new LinkedList<>();
        Queue<Integer> orderQueue = new LinkedList<>();
        Stack<Integer> secondBelt = new Stack<>();

        for(int order : orders)
            orderQueue.offer(order);


        for(int i = 1; i <= orders.length; i++) {
            if(! orderQueue.isEmpty() && i == orderQueue.peek()) {
                orderQueue.poll();
                answer++;

                while(! secondBelt.isEmpty()) {
                    if(! Objects.equals(secondBelt.peek(), orderQueue.peek())) break;
                    else {
                        answer++;
                        secondBelt.pop();
                        orderQueue.poll();
                    }
                }
            } else {
                secondBelt.push(i);
            }
        }

        System.out.println("second belt: " + secondBelt);
        return answer;
    }
    public static void main(String [] args) {
        Solution solution = new Solution();
//        int [] order = new int[] {4,3,1,2,5};
        int [] order = new int[] {5,4,3,2,1};
        var result = solution.solution(order);
        System.out.println("result: " + result);
    }
}
