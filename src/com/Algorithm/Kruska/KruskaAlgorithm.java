package com.Algorithm.Kruska;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class KruskaAlgorithm {


    public static int INF = 10000;
    public int edgeNum;
    public char[] vertexs;
    public int[][] matrix;

    public static void main(String[] args) {
        char[] vertexs = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        //克鲁斯卡尔算法的邻接矩阵
        int matrix[][] = {
            /*A*//*B*//*C*//*D*//*E*//*F*//*G*/
            /*A*/ {   0,  12, INF, INF, INF,  16,  14},
            /*B*/ {  12,   0,  10, INF, INF,   7, INF},
            /*C*/ { INF,  10,   0,   3,   5,   6, INF},
            /*D*/ { INF, INF,   3,   0,   4, INF, INF},
            /*E*/ { INF, INF,   5,   4,   0,   2,   8},
             /*F*/ {  16,   7,   6, INF,   2,   0,   9},
             /*G*/ {  14, INF, INF, INF,   8,   9,   0}};
        KruskaAlgorithm kruskaAlgorithm = new KruskaAlgorithm(vertexs, matrix);
    }

    public KruskaAlgorithm(char[] vertexs, int[][] matrix) {
        int vlent = vertexs.length;
        this.vertexs = new char[vlent];
        for (int i = 0; i < vertexs.length; i++) {
            this.vertexs[i] = vertexs[i];
        }
        this.matrix = new int[vlent][vlent];
        for (int i = 0; i< vlent; i++) {
            for (int j =0; j < vlent; j++) {
                this.matrix[i][j] = matrix[i][j];
                if (this.matrix[i][j] != INF && this.matrix[i][j] != 0) {
                    edgeNum++;
                }
            }
        }
        edgeNum = edgeNum / 2;
        EData[] edges = getEdges();

        //排序之后
        sortEdges(edges);
        ArrayList<EData> result = new ArrayList<EData>();
        for (int i = 0; i < edges.length; i++) {
            result.add(edges[i]);
            if ( !isFit(result)) {
                result.remove(edges[i]);
            }
        }
        for (EData data : result) {
            System.out.println("从 " + data.start + "->到"+ data.end + " 距离为:" + data.weight);
        }



    }

    public boolean isFit(ArrayList<EData> chars) {
        HashSet<Character> fixSet = new HashSet<Character>();
        for (EData data : chars) {
            fixSet.add(data.start);
            fixSet.add(data.end);
        }
        return fixSet.size() > chars.size();
    }


    public void print() {
        System.out.println("开始打印邻接矩阵");
        for (int i = 0; i < vertexs.length; i++) {
            System.out.println(Arrays.toString(this.matrix[i]));
        }
    }

    public EData[] getEdges() {
        int index = 0;
        EData[] edges = new EData[edgeNum];
        for (int i = 0; i < vertexs.length; i++) {
            for (int j = i + 1; j < vertexs.length; j++) {
                if (matrix[i][j] != INF) {
                    edges[index] = new EData(vertexs[i], vertexs[j], matrix[i][j]);
                    index++;
                }
            }
        }
        return edges;

    }

    public void sortEdges(EData[] edges) {
        for (int i = 0; i < edges.length - 1; i++) {
            for (int j = 0; j < edges.length - 1- i; j++) {
                if (edges[j].weight > edges[j+1].weight) {
                    EData temp = edges[j];
                    edges[j] = edges[j+1];
                    edges[j+1] = temp;
                }
            }
        }
    }

    public int getPosition(char ch) {
        for (int i = 0; i < vertexs.length; i++) {
            if (vertexs[i] == ch) {
                return i;
            }
        }
        return -1;
    }
}

class EData{
    char start;
    char end;
    public int weight;

    public EData(char start, char end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "EData{" +
                "start=" + start +
                ", end=" + end +
                ", weight=" + weight +
                '}';
    }

}
