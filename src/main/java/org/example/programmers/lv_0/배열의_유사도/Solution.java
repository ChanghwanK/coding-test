package org.example.programmers.lv_0.배열의_유사도;

public class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        if(s1.length <= s2.length) {
            for(int i = 0; i < s1.length; i++) {
                for(int j = 0; j < s2.length; j++) {
                    if (s1[i].equals(s2[j])) answer += 1;
                }
            }
        } else {
            for(int i = 0; i < s2.length; i++) {
                for(int j = 0; j < s1.length; j++) {
                    if (s2[i].equals(s1[j])) answer += 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String [] a1 = new String[] {"a", "b", "c"};
        String [] a2 = new String[] {"com", "b", "d", "p", "c"};

        String [] b1 = new String[] {"n", "omg"};
        String [] b2 = new String[] {"m", "dot"};


        Solution solution = new Solution();
        System.out.println("result: " + solution.solution(a1, a2));

        System.out.println("===============");

        System.out.println("result: " + solution.solution(b1, b2));
    }

}
