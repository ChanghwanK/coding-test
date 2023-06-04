package org.example.programmers.lv_01.대충_만든_자판;

import java.util.Arrays;

public class Solution {

    /**
     * what
     * - 이 휴대폰 자판을 이용해 특정 문자열을 작성할 때, 키를 최소 몇 번 눌러야 그 문자열을 작성할 수 있는지 알아보고자 합니다.
     * 조건
     * - 이 휴대폰 자판은 키의 개수가 1개부터 최대 100개까지 있을 수 있으며, 특정 키를 눌렀을 때 입력되는 문자들도 무작위로 배열되어 있습니다.
     *  - 같은 문자가 자판 전체에 여러 번 할당된 경우도 있고,
     *  - 키 하나에 같은 문자가 여러 번 할당된 경우도 있습니다.
     *  - 심지어 아예 할당 x -> 따라서 몇몇 문자열은 작성할 수 없을 수도 있습니다.
     */

    /**
     * 각 keymap에서 몇번 눌렀을 때 무슨 문자열이 있는지 만들어둔다.
     * {
         1: "a",
         2: "b",
         3" "c"
     * }
     * 위와 같은 형식
     *
     * 이 때 target에서 문자 하나 때와서 keymap에 각각 쿼리한 뒤 더 작은 숫자를 더한다.
     */
    /**
     * 위 방법으로 하니까 map을 몇개 만들어야할지 동적으로 결정되어 진행하기 어려움
     *
     * 그럼 이렇게하자
     * keymap을 돌면서 각 keymap에서 해당 문자열에 몇번만에 도달할 수 있는지 체크하기
     *  최솟값을 찾아 갱신
     */
    public int[] solution(String[] keymaps, String[] targets) {
        int[] answer = new int[targets.length];

        int k = 0;
        for (String target : targets) {

            int res = 0;

            for (char cur : target.toCharArray()) {
                int cnt = Integer.MAX_VALUE;
                for (String keymap : keymaps) {
                    // keymap에서 몇번만에 도달 가능하지 체크
                    for (int i = 0; i < keymap.length(); i++) {
                        char val = keymap.charAt(i);
                        if (cur == val) {
                            if (cnt >= i + 1) {
                                cnt = i + 1;
                                break;
                            }
                        }
                    }
                }
                if (res != Integer.MAX_VALUE) {
                    res += cnt;
                }

            }

            if (res == Integer.MAX_VALUE)
                answer[k] = -1;
            else
                answer[k] = res;
            k++;
        }


        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
//        var result = solution.solution(new String[] {"ABACD", "BCEFD"}, new String[] {"ABCD","AABB"});

        var result = solution.solution(new String[] {"AGZ", "BSSS"}, new String[] {"ABCD","AABB"});

//        var result = solution.solution(new String[] {"AA"}, new String[] {"B"});
//        var result = solution.solution(new String[] {"ABCE"}, new String[] {"ABDE"});

        System.out.println("result: " + Arrays.toString(result));
    }
}
