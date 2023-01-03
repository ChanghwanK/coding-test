package org.example.programmers.lv_02.신고결과_받기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        // id - 신고목록
        HashMap<String, Set<String>> map1 = new LinkedHashMap<>();

        // id - 신고당한 횟수
        HashMap<String, Integer> map2 = new LinkedHashMap<>();
        for (String id : id_list)
            map1.put(id, new HashSet<>());

        // set에 유저가 신고한 Id 추가
        // 신고한 Id가 같다면 카운팅 X
        for (String r : report) {
            String [] keyValue = r.split(" ");
            String key = keyValue[0];
            String value = keyValue[1];

            map1.get(key).add(value);
            // 신고자가 다른 경우에만
            map2.put(value, map2.getOrDefault(value, 0) + 1);
        }

        List<String> idLists = new ArrayList<>();  // k번 이상 등장한 id 목록

        for (String key : map2.keySet())
            if (map2.get(key) >= k) idLists.add(key);

        System.out.println("id - 신고목록: " + map1);
        System.out.println("id - 횟수: " + map2);
        System.out.println(idLists);

        List<Integer> ans = new ArrayList<>();
        for (String key : map1.keySet()) {
            Set<String> reportIds = map1.get(key); // 신고 목록
            int cnt = 0;
            // K번 이상 등장한 Id 목록에 신고 목록이 포함된다면 cnt
            for (String id : idLists) {
                if(reportIds.contains(id)) cnt++;
            }
            ans.add(cnt);
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        String [] user_id = {"muzi", "frodo", "apeach", "neo"};
        String [] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
//        String [] user_id = {"con", "ryan"};
//        String [] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        var result = solution.solution(user_id, report, 3);
        System.out.println("result: " + Arrays.toString(result));
    }
}
