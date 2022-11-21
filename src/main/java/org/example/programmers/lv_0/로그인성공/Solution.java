package org.example.programmers.lv_0.로그인성공;

import java.util.HashMap;

public class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        HashMap<String, String> userDB = new HashMap<>();
        // 데이터 적재
        for(String[] strings : db) {
            String id = strings[0];
            String pw = strings[1];
            userDB.put(id, pw);
        }

        System.out.println(userDB);
        String inputId = id_pw[0];
        String inputPW = id_pw[1];

        if(userDB.get(inputId) == null) {
            return "fail";
        } else {
           String savedPw = userDB.get(inputId);
           if(inputPW.equals(savedPw)) {
               return "login";
           } else {
               return "wrong pw";
           }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String [] id_pw = new String[] {"meosseugi", "1234"};
        String [][] db = new String[][] {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        System.out.println("Result: " + solution.solution(id_pw, db));
    }

}
