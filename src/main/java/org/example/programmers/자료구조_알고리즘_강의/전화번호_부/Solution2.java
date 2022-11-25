package org.example.programmers.자료구조_알고리즘_강의.전화번호_부;

import java.util.Arrays;

public class Solution2 {
    public boolean solution(String[] phone_book) {
//        System.out.println("before sorted: " + Arrays.toString(phone_book));
//        Arrays.sort(phone_book);
//        System.out.println("after sorted: " + Arrays.toString(phone_book));
        for(int i = 0; i < phone_book.length; i++) {
            String s = phone_book[i];
            for(int j = i + 1; j < phone_book.length; j++) {
                if(phone_book[j].startsWith(s)) return false;
            }
        }

        for(String s1 : phone_book) {

            for(String s2 : phone_book) {
                if(s1.equals(s2)) continue;
                if(s1.startsWith(s2)) return false;
            }

        }
        return true;
    }

    public static void main(String [] args) {
        String [] phoneBook = new String[] {"119", "97674223", "1195524421"};
//        String [] phoneBook1 = new String[] {"123","456","789"};
        Solution2 solution = new Solution2();
        var result = solution.solution(phoneBook);
        System.out.println(result);
    }
}
