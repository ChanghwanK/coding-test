package org.example.programmers.lv_0.외계어_사전;

import java.util.ArrayList;

/**
 * 방법
 * 1. spell로 만들 수 있는 문자 조합을 다 찾고 dic와 비교 (모든 조합을 찾는 것은 반복문이 spell의 len만큼 들어가니까 넘 힘듬
 * 2. 하나하나 반복하면서 spell과 dic를 비교해서 하나라도 포함하지 않는다면 탈락
 *
 */
public class Solution {
    static String dicWord = "";
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        // 반복문을 다 돌고난 뒤의 상태가 나와야함
        // spell로 dic의 문자를 하나라도 만들 수 있다면 true
        // 문자를 만들 수 있다는 것은 dic가 spell로 이루어져있다는 것을 의미
        // - contain체크를 해서 false이면 해당 dic는 spell을 포함하지 않는다는 것
        // - 다음 문자를 찾아보면 됨
        for(int i = 0; i < dic.length; i++) {
            dicWord = dic[i];
            if(dicWord.length() == spell.length) {
                if(isDicCreatedWithSpell(spell)) return 1;
                else answer = 2;
            } else {
                answer = 2;
            }
        }
        return answer;
    }

    /**
     * 해당 문자를 포함한다면 true 그렇지 않다면 false
     */
    private boolean isDicCreatedWithSpell(String [] spell) {
        boolean flag = true;
        for(String s : spell) {
            if(! dicWord.contains(s))
                return false;
        }
        return flag;
    }

    public static void main(String[] args) {
//        String [] spell = new String[] {"p", "o", "s"};
//        String [] dict = new String[] {"sod", "eocd", "qixm", "adio", "soo"};
        String [] spell = new String[] {"z", "d", "x"};
//        String [] dict = new String[] {"def", "dww", "dzx", "loveaw"};
        String [] dict = new String[] {"zdx2"};
//        String [] spell = new String[] {"s", "o", "m", "d"};
//        String [] dict = new String[] {"moos", "dzx", "smm", "sunmmo", "som"};

        Solution solution = new Solution();
        System.out.println("result: " + solution.solution(spell, dict));
    }
}
