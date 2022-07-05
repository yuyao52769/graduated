package com.Algorithm.LeetCode;

import java.awt.*;

public class NearestPoint {

    public int solution(int x, int y, int[][] points) {
        int minDistance = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                if (Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y) < minDistance){
                    minDistance = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                    minIndex = i;
                }
            }
        }
        return minIndex;
    }
}
