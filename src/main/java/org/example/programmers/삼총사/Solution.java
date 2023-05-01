package org.example.programmers.삼총사;

public class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int arrayLength = number.length;

        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                for (int k = j + 1; k < arrayLength; k++) {
                    int a = number[i];
                    int b = number[j];
                    int c = number[k];

                    if((a + b + c) == 0)
                        answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var a = new int[] {-2, 3, 0, 2, -5};
        var result = solution.solution(a);
        System.out.println("result: " + result);
    }

}
