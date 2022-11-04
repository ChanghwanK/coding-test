package org.example.programmers.lv_01.햄버거;
import java.util.ArrayList;

public class Solution {
    public int solution(int[] ingredient) {
        int cnt = 0;
        ArrayList<Integer> ingredients = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(1);
        answer.add(2);
        answer.add(3);
        answer.add(1);

        for(int j : ingredient) {
            ingredients.add(j);

            if(ingredients.size() >= 4) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(ingredients.get(ingredients.size() - 4));
                temp.add(ingredients.get(ingredients.size() - 3));
                temp.add(ingredients.get(ingredients.size() - 2));
                temp.add(ingredients.get(ingredients.size() - 1));

                if(temp.equals(answer)) {
                    cnt++;
                    ingredients.remove(ingredients.size() - 1);
                    ingredients.remove(ingredients.size() - 1);
                    ingredients.remove(ingredients.size() - 1);
                    ingredients.remove(ingredients.size() - 1);
                }
            }
        }
        return cnt;
    }


    public static void main(String...ars) {
        int [] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int [] ingredient2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        Solution solution = new Solution();
        int result = solution.solution(ingredient);
        System.out.println("result " + result);
    }
}
