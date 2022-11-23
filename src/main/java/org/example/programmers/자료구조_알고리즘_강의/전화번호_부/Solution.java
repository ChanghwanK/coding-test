package org.example.programmers.자료구조_알고리즘_강의.전화번호_부;

import java.util.Arrays;

public class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for(int i = 1; i < phone_book.length; i++) {
            if(phone_book[i].startsWith(phone_book[i-1])) return false;
        }
        return true;
    }

    public static void main(String [] args) {
        String [] phoneBook = new String[] {"119", "97674223", "1195524421"};
        String [] phoneBook1 = new String[] {"123","456","789"};
        Solution solution = new Solution();
        var result = solution.solution(phoneBook);
        System.out.println(result);
    }
}
