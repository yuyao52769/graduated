package com.Algorithm.prim;

import java.util.Arrays;
import java.util.List;

public class PrimAlgorithm {

    public static void main(String[] args) {
        char[] data = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int verxs = data.length;
        int [][]weight=new int[][]{
                {10000,5,7,10000,10000,10000,2},
                {5,10000,10000,9,10000,10000,3},
                {7,10000,10000,10000,8,10000,10000},
                {10000,9,10000,10000,10000,4,10000},
                {10000,10000,8,10000,10000,5,4},
                {10000,10000,10000,4,5,10000,6},
                {2,3,10000,10000,4,6,10000},};

        MGraph graph = new MGraph(verxs);
        MinTree minTree = new MinTree();
        minTree.createGraph(graph, verxs, data, weight);
        minTree.showGraph(graph);
        minTree.prim(graph, 0);
    }

    
}


class MinTree{
    /**
     *
     * @param graph
     * @param verxs
     * @param data
     * @param weight
     */
    public void createGraph(MGraph graph, int verxs, char[] data, int[][] weight){
       int i,j;
       for (i = 0; i < verxs; i++) {
           graph.data[i] = data[i];
           for (j = 0; j < verxs; j++) {
               graph.weight[i][j] = weight[i][j];
           }
       }
    }

    public void showGraph(MGraph graph){
        for (int[] link : graph.weight) {
            System.out.println(Arrays.toString(link));
        }
    }

    /**
     *
     * @param graph
     * @param v
     */
    public void prim(MGraph graph, int v) {
        int[] visited = new int[graph.verx];

        visited[v] = 1;
        int h1 = -1;
        int h2 = -1;
        for (int k = 1; k < graph.verx; k++) {
            int minWeight = 10000;
            for (int i = 0; i < graph.verx; i++) {
                for (int j = 0; j < graph.verx; j++) {
                    if (visited[i] == 1 && visited[j] == 0 && graph.weight[i][j] < minWeight) {
                        minWeight = graph.weight[i][j];
                        h1 = i; 
                        h2 = j;
                    }
                }
            }
            visited[h2] = 1;
            System.out.println("现在找到的点是:" + graph.data[h1] + " 和 " + graph.data[h2]);
        }
    }


}

class MGraph{
    int verx; // 节点个数
    char[] data; // 存放节点数据
    int[][] weight; //邻接矩阵

    /**
     *
     * @param verxs
     */
    public MGraph(int verxs){
        this.verx = verxs;
        data = new char[verxs];
        weight = new int[verxs][verxs];
    }
}
