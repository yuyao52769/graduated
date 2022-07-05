package com.DataStructure.SparseArraysAndQueues;

import java.io.*;

/**
 *    稀疏数组
 *    同时具备将得到的稀疏数组存储到文件中
 */
public class SparseArray {

    public SparseArray(int[][] arr) throws IOException {
        int[][] ints = compute(arr);
        printArr(ints);
        saveFile(ints);
    }

    public int[][] compute(int[][] arr){
        printArr(arr);
        System.out.println("=================");
        int row = arr.length;      // 行
        int col = arr[0].length;   // 列
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] != 0) {
                    sum ++;
                }
            }
        }

        int[][] result = new int[sum+1][3];
        result[0][0] = row;
        result[0][1] = col;
        result[0][2] = sum;
        int index = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] != 0) {
                    result[index][0] = (i+1);
                    result[index][1] = (j+1);
                    result[index][2] = arr[i][j];
                    index++;
                }
            }
        }
        return result;
    }

    public void printArr(int[][] arr){
        for (int[] cow : arr) {
            for (int item : cow) {
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }
    }

    public void saveFile(int[][] arr) throws IOException {
        File file = new File("C:\\Users\\yao\\IdeaProjects\\Graduated\\TestFiles\\data.txt");
        try {
            FileWriter fos = new FileWriter(file,false);
            for (int[] row : arr){
                for (int item : row){
                    fos.write(String.valueOf(item) + " ");
                }
                fos.write("\n");
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        int[][] origin = new int[11][9];
        origin[0][0] = 10;
        origin[3][0] = 10;
        origin[2][8] = 10;
        origin[5][6] = 10;
        origin[6][2] = 10;
        new SparseArray(origin);
    }
}
