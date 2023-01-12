package org.example.baekjoon.방번호;

import java.util.Scanner;

public class Main {
    static int ans = 1;

    public static void addNumberSet(int [] numberSet) {
        ans++;
        for(int i = 0; i <= 9; i++) {
            numberSet[i] += 1;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roomNumber = sc.next();

        int [] numberSet = new int[10];

        for(int i = 0; i <= 9; i++) numberSet[i] = 1;

        for(char word : roomNumber.toCharArray()) {
            int numWord = Character.getNumericValue(word);

            // 6 또는 9가 아닌데 사용할 수 있는 개수가 1보다 작다면
            // 더 이상 사용할 수 있는 숫자가 없기 떄문에 세트 추가
            if (numWord != 6 && numWord != 9 && numberSet[numWord] == 0) {
                addNumberSet(numberSet);
                numberSet[numWord] -= 1;
            }
            // 6인데 number set에 6이 없다면 9가 있는지 체크
            // 9도 더 사용할 수 없다면 세트 추가
            // 9가 있다면 9 한 개 사용
            else if (numWord == 6 && numberSet[numWord] == 0){
                if (numberSet[9] == 0) {
                    addNumberSet(numberSet);
                    numberSet[numWord] -= 1;
                } else {
                    numberSet[9] -= 1;
                }
            }
            // 반대로 9인데 number set에 9가 없다면 6이 있는지 체크
            // 6이 없다면 세트 추가
            // 있다면 6 사용
            else if (numWord == 9 && numberSet[numWord] == 0) {
                if (numberSet[6] == 0) {
                    addNumberSet(numberSet);
                    numberSet[numWord] -= 1;
                } else {
                    numberSet[6] -= 1;
                }
            }
            else {
                numberSet[numWord] -= 1;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
