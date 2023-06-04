package org.example.programmers.lv_01.대충_만든_자판;

import java.util.Arrays;

public class Solution3 {
    public int[] solution(String[] keymaps, String[] targets) {
        int [] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            if(! isEnable(keymaps, target)) {
                answer[i] = -1;
                continue;
            }

            int cnt = count(target, keymaps);
            answer[i] = cnt;
        }

        return answer;
    }

    // target의 원소가 keymap 전체에 포함되지 않았다면 만들수 없음
    // 둘중 한곳이라도 있다면 만들 수 있음
    private boolean isEnable(final String[] keymaps, final String target) {

        // 양 배열에 해당 원소가 있는지 알아내야 함
        // 양 배열 모두 없다면 만들 수 없음
        for (char element : target.toCharArray()) {
            StringBuilder results = new StringBuilder();

            for (String keymap : keymaps) {
                if (keymap.indexOf(element) == - 1) {
                    results.append("1");
                } else {
                    results.append("0");
                }
            }

            if (! results.toString().contains("0"))
                return false;
        }
        return true;
    }

    private int count(final String target, final String [] keymaps) {
        int res = 0;

        for (char element : target.toCharArray()) {
            int min = Integer.MAX_VALUE;
            // keymap에서 몇번째 만에 달성할 수 있는가?
            for (String keymap : keymaps) {
                int val = keymap.indexOf(element);
                if (val != -1)
                    min = Math.min(min, keymap.indexOf(element) + 1);
            }
            res += min;
        }
        return res;
    }

    public static void main(String [] args) {
        Solution3 solution = new Solution3();
        var result = solution.solution(new String[] {"ABACD", "BCEFD"}, new String[] {"ABCD","AABB"});
//        System.out.println(solution.isEnable(new String[] {"ABCE"}, "ABDE"));
//        var result = solution.solution(new String[] {"AGZ", "BSSS"}, new String[] {"ABCD","AABB"});

//        System.out.println(solution.isEnable(new String[] {"ABCE"}, "ABDE"));

//        var result = solution.solution(new String[] {"AA"}, new String[] {"B"});
//        var result = solution.solution(new String[] {"ABCE"}, new String[] {"ABDE"});
        System.out.println("result: " + Arrays.toString(result));
    }

}
