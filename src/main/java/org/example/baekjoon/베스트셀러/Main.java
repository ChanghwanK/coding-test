package org.example.baekjoon.베스트셀러;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> bookSaleMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();

        for(int i = 0; i < TC; i++) {
            String title = sc.next();
            bookSaleMap.put(title, bookSaleMap.getOrDefault(title, 0) + 1);
        }

        List<Entry<String, Integer>> entryList = bookSaleMap.entrySet().stream()
            .sorted((entry01, entry02) -> {
                if(entry01.getValue() == entry02.getValue()) {
                    return entry01.getKey().compareTo(entry02.getKey());
                }
                return entry02.getValue() - entry01.getValue();
            }).collect(Collectors.toList());

        System.out.println(entryList.get(0).getKey());

//        List<Entry<String, Integer>> entries = new LinkedList<>(bookSaleMap.entrySet());
//
//        entries.sort(
//            (o1, o2) -> {
//                if(o1.getValue() == o2.getValue()) {
//                    return o1.getKey().compareTo(o2.getKey());
//                }
//                return o2.getValue() - o1.getValue();
//            })
//        ;
//
//        System.out.println(entries.get(0).getKey());
    }
}
