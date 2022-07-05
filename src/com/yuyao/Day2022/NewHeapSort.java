package com.yuyao.Day2022;

public class NewHeapSort {


    /**
     * 对索引为i的节点为父节点的二叉树，进行排序，保证当前i节点数字最大
     * @param arr
     * @param i
     * @param length
     */
    public void heapOneFatherTree(int[] arr, int i, int length){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left == length || right == length) {
            return;
        }
        int bigger = left;
        if (arr[left] < arr[right]) {
            bigger = right;
        }
        if (arr[i] < arr[bigger]){
            swap(arr, i, bigger);
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
