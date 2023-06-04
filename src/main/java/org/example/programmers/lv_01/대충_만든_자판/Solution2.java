package org.example.programmers.lv_01.대충_만든_자판;

import java.util.Arrays;

public class Solution2 {
    public int[] solution(String[] keymaps, String[] targets) {
        int[] answer = new int[targets.length];

        int k = 0;
        for (String target : targets) {
            // target을 keymap의 원소로 만들 수 있을 경우에만 시작
            if(! checkEnable(keymaps, target)) {
                answer[k] = -1;
                k++;
                continue;
            }

            int res = 0;
            for (char c : target.toCharArray()) {
                int cnt = Integer.MAX_VALUE;
                for (String keymap : keymaps) {
                    for (int i = 0; i < keymap.length(); i++) {
                        if (keymap.charAt(i) == c) {
                            if (cnt > i) {
                                cnt = i + 1;
                                break;
                            }
                        }
                    }
                }
                res += cnt;
            }
            answer[k] = res;
            k++;
        }

        return answer;
    }

    // 둘다 없으면 return false
    public boolean checkEnable(String [] keymaps, String target) {
//        boolean res = true;
        boolean [] resArray = new boolean[keymaps.length];
        for (int i = 0; i < keymaps.length; i++) {
            resArray[i] = true;
        }

        // 둘중 하나라도 포함이면 넘어가면 됨
        for (char c : target.toCharArray()) {
            for (int i = 0; i < keymaps.length; i++) {
                String keymap = keymaps[i];
                if (keymap.indexOf(c) == -1) {
                    // 현재 키맵으론 해당 타겟을 못만듬
                    resArray[i] = false;
                }
            }

            boolean flag = false;
            for (int i = 0; i < resArray.length; i++) {
                if (resArray[i]) {
                    flag = true;
                }
            }

            if (! flag)
                return false;
        }

        return true;
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
//        var result = solution.solution(new String[] {"ABACD", "BCEFD"}, new String[] {"ABCD","AABB"});
        var result = solution.solution(new String[] {"AGZ", "BSSS"}, new String[] {"ASA","BGZ"});
//        var result = solution.solution(new String[] {"AA"}, new String[] {"B"});

//        var result = solution.solution(new String[] {"ABCE"}, new String[] {"ABDE"});

        System.out.println("result: " + Arrays.toString(result));
    }
}
