package org.example.baekjoon.숫자카드2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // 입력
//        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] sangenCards = new int[n];
        String [] strings = br.readLine().split(" ");
        for(int i = 0; i < strings.length; i++) {
            sangenCards[i] = Integer.parseInt(strings[i]);
        }

        int m = Integer.parseInt(br.readLine());
        int [] givenCards = new int[m];
        String [] strings2 = br.readLine().split(" ");
        for(int i = 0; i < strings2.length; i++) {
            givenCards[i] = Integer.parseInt(strings2[i]);
        }

        StringBuilder ans = new StringBuilder();

        for(int givenCard : givenCards) {
            int cnt = 0;
            for(int sangenCard : sangenCards) {
                if(givenCard == sangenCard) cnt++;
            }
            ans.append(cnt).append(" ");
        }

        System.out.println(ans);
    }

}
