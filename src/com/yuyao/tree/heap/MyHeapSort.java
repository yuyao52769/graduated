package com.yuyao.tree.heap;

public class MyHeapSort {

    public static void main(String[] args) {

    }

    public static void heapSort(int[] arr) {
        int temp = 0;
        for (int i = arr.length/2-1; i >= 0; i --) {
            adjust(arr, i, arr.length);
        }

        for (int j = arr.length -1; j > 0; j--) {
            temp = arr[j];
            arr[j] = arr[0];
            arr[0] = temp;
            adjust(arr, 0, arr.length - 1);
        }
    }

    public static void adjust(int[] arr, int index, int length) {
        int temp = arr[index];
        for (int i = index * 2 + 1; i < length; i = i * 2 +1) {
            if (arr[i] < arr[i + 1]) {i++;}
            if (arr[i] > temp) {
                arr[index] = arr[i];
                index = i;
            }
            else {break;}
        }
        arr[index] = temp;
     }
}
