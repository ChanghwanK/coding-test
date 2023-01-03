package org.example.programmers.lv_02.신고결과_받기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution2 {
    public int[] solution(String[] id_list, String[] report, int k) {
        System.out.println("origin: " + Arrays.toString(report));
        List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
        System.out.println("list: " + list);

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
        }
        System.out.println("id - 신고목록: " + map1);
        /**
         * 카운팅 집계
         */
        // 이렇게하면 신고 유저가 다르다는 것은 보장됨
        // 등장횟수를 셀거임
        for (String key : map1.keySet()) {
            for(String a : map1.get(key)) {
                map2.put(a, map2.getOrDefault(a, 0) + 1);
            }
        }

        System.out.println("------");
        System.out.println("map2: " + map2);


        List<String> idLists = new ArrayList<>();  // k번 이상 등장한 id 목록
        for (String key : map2.keySet())
            if (map2.get(key) >= k) idLists.add(key);

        System.out.println("k번 이상: " + idLists);

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
        Solution2 solution = new Solution2();
//        String [] user_id = {"muzi", "frodo", "apeach", "neo"};
//        String [] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        String [] user_id = {"con", "ryan"};
        String [] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        var result = solution.solution(user_id, report, 3);
        System.out.println("result: " + Arrays.toString(result));
    }
}
