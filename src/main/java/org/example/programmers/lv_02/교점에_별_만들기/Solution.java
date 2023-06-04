package org.example.programmers.lv_02.교점에_별_만들기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String[] solution(int[][] line) {
        String[] answer = {};
        List<Point> points = new ArrayList<>();
        // 모든 직선의 교점을 구한다.
        // 1-2 1-3 2-3
        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                Point intersection = intersection(line[i][0], line[i][1], line[i][2], line[j][0], line[j][1], line[j][2]);
                if (intersection != null) {
                    points.add(intersection);
                }
            }
        }

        Point minimum = getMinimumPoint(points);
        Point maximum = getMaximumPoint(points);

        int width = (int) (maximum.x - minimum.x + 1);
        int height = (int) (maximum.y - minimum.y + 1);

        char[][] arr = new char[height][width];

        for (char [] row : arr) {
            Arrays.fill(row, '.');
        }

        // 교점은 points 리스트에 존재함
        for (Point p : points) {
            int x = (int)  (p.x - minimum.x);
            int y = (int)  (maximum.y - p.y);

            arr[y][x] = '*';
        }

        String [] result = new String[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new String(arr[i]);
        }

        return result;
    }

    private static class Point {
        public final long x;
        public final long y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" + "x=" + x + ", y=" + y + '}';
        }
    }

    /**
     * a1x + b1y + c1 = 0
     * a2x + b2y + c2 = 0
     *
     * x = b1 * c2 - c1 * b2 / a1 * b2 - b1 * a2
     * y = c1 * a2 - a1 * c2 / a1 * b2 - b1 * a2
     *
     *
     */
    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {
        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);

        if (x % 1 != 0 || y % 1 != 0) return null;
        return  new Point((long) x, (long) y);
    }

    private Point getMaximumPoint(List<Point> points) {
        long maximumX = Long.MIN_VALUE;
        long maximumY = Long.MIN_VALUE;

        for (Point p : points) {
            if (p.x > maximumX) maximumX = p.x;
            if (p.y > maximumY) maximumY = p.y;
        }

        return new Point(maximumX, maximumY);
    }

    private Point getMinimumPoint(List<Point> points) {
        long minimumX = Long.MAX_VALUE;
        long minimumY = Long.MAX_VALUE;

        for (Point p : points) {
            if (p.x < minimumX) minimumX = p.x;
            if (p.y < minimumY) minimumY = p.y;
        }

        return new Point(minimumX, minimumY);
    }


    public static void main(String [] args) {
        Solution solution = new Solution();
        int [][] a =  new int [][] {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1},{5, -8, -12}, {5, 8, 12}};
        var result = solution.solution(a);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
