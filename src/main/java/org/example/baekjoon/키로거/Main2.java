package org.example.baekjoon.키로거;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    /**
     * '-' 백스페이스 (바로 앞에 글자가 존재한다면 지움)
     * '<' '>'  왼쪽 오른쪽으로 커서를 한 칸 이동
     *  만약 커서의 위치가 줄의 마지막이 아니라면, 커서 및 커서 오른쪽에 있는 모든 문자는 오른쪽으로 한 칸 이동한다.
     *  BAP
     */
    static String solve(String inputVal) {
        int cursorPosition = 0;
        List<String> ans = new LinkedList<>();

        for(char word : inputVal.toCharArray()) {
            switch(word) {
                case '<':
                    if(cursorPosition > 0) cursorPosition--;
                    break;
                case '>':
                    cursorPosition++;
                    break;
                case '-':
                    if(ans.size() > 0) {
                        if(cursorPosition >= ans.size()) cursorPosition = ans.size() - 1;
                        ans.remove(cursorPosition);
                    }
                    break;
                default:
                    if(cursorPosition > ans.size()) {
                        cursorPosition = ans.size();
                    }
                    ans.add(cursorPosition, String.valueOf(word));
                    cursorPosition++;
                    break;
            }

        }

        return String.join("", ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        for(int i = 0; i < N; i++) {
//            String value = sc.next();
//            String res = solve(value);
//            System.out.println(res);
//        }

        List<String> ans = new LinkedList<>();
        for(int i = 0; i < 5; i++) {
            ans.add(sc.next());
        }
        ans.remove(0);
        System.out.println(String.join("", ans));
    }
}
