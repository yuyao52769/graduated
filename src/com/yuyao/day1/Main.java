package com.yuyao.day1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void function_1 (ArrayList<Point> question) {
        int costs = 0;
        for (int i = 0; i < question.size(); i ++) {

        }

    }

    public static void main(String[] args) {
        ArrayList<Point> question = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int allPointNumber = sc.nextInt();
        while (sc.hasNext()) {
            int index = 0;
            String pointName = sc.next();
            int cost = sc.nextInt();
            ArrayList<Integer> nextPoints = new ArrayList<>();
            while (sc.hasNextInt()) {
                nextPoints.add(sc.nextInt());
            }
            index ++;
            question.add(new Point(index - 1, pointName, cost, nextPoints));
        }

    }

}

class Point {
    private int index;
    private String pointName;
    private int cost;
    private ArrayList<Integer> nextPoints;



    public Point(int index, String pointName, int cost, ArrayList<Integer> nextPoints) {
        this.index = index;
        this.pointName = pointName;
        this.cost = cost;
        this.nextPoints = nextPoints;
    }

    public int getIndex() {
        return index;
    }

    public int getCost() {
        return cost;
    }

    public ArrayList<Integer> getNextPoints() {
        return nextPoints;
    }
}
