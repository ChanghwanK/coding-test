package org.example.baekjoon.문서_검색;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String document = sc.nextLine();
        String target = sc.nextLine();

        // 총 몇번 등장하는지 검색
        int cnt = getContainTargetWordCntInDocument(document, target);
        System.out.println(cnt);
    }


    // 중복 제거
    // 찾으면 index를 target.length만큼 넘어가야함
    /**
     * @return document에 target이 얼마나 포함되었는지
     */
    private static int getContainTargetWordCntInDocument(String document, String target) {
        int cnt = 0;
        int windowSize = target.length();
        int startIdx = 0;
        int endIdx = document.length() - target.length() + 1;

        for(int i = startIdx; i < endIdx; i++) {
            String subedTempWord = document.substring(i, windowSize + i);
            if(target.equals(subedTempWord)) {
                cnt++;
                i += target.length() - 1;
            }
        }
        return cnt;
    }
}
