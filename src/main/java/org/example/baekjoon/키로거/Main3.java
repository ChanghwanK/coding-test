package org.example.baekjoon.키로거;

import java.util.Scanner;
import java.util.Stack;

/**
 * using stack
 */
public class Main3 {
    static String solve(String value) {
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        StringBuilder leftSB = new StringBuilder();
        StringBuilder rightSB = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for(char word : value.toCharArray()) {
            switch(word) {
                case '<':
                    if(!left.isEmpty())
                        right.push(left.pop());
                    break;
                case '>':
                    if(!right.isEmpty())
                        left.push(right.pop());
                    break;
                case '-':
                    if(!left.isEmpty())
                        left.pop();
                    break;
                default:
                    left.push(word);
            }
        }

        for(Character character : left) {
            leftSB.append(character);
        }
        ans.append(leftSB);

        for(Character character : right) {
            rightSB.append(character);
        }

        ans.append(rightSB.reverse());

        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            String value = sc.next();
            String res = solve(value);
            System.out.println(res);
        }
    }

}
