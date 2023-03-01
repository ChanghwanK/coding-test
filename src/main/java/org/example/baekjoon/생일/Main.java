package org.example.baekjoon.생일;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static class Student {
        String name;
        int year;
        int month;
        int day;

        public Student(String name, int year, int month, int day) {
            this.name = name;
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        List<Student> students = new ArrayList<>();

        for(int i = 0; i < TC; i++) {
            String name = sc.next();
            int day = Integer.parseInt(sc.next());
            int month = Integer.parseInt(sc.next());
            int year = Integer.parseInt(sc.next());
            Student student = new Student(name, year, month, day);
            students.add(student);
        }

        students.sort(
            (s1, s2) -> {
                if(s1.year == s2.year) {
                    if(s1.month == s2.month) {
                        return s2.day - s1.day;
                    } else {
                        return s2.month - s1.month;
                    }
                }
                return s2.year - s1.year;
            }
        );

        System.out.println(students.get(0).name);
        System.out.println(students.get(students.size() - 1).name);
    }

}
