package com.Algorithm.prim;

import java.util.Arrays;

public class MyMergeSort {

    public void sort(int[] arr) {
        sort(arr, 0, arr.length-1);
    }

    public void sort(int[] arr, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = left + ((right - left) >> 1) ;
        sort(arr, left, mid);
        sort(arr, mid+1, right);
        merge(arr, left, mid, right);
    }

    public void merge(int[] arr, int left, int mid, int right) {
        int[] help = new int[right-left+1];
        int index = 0;
        int p1 = left;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= right) {
            help[index++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid) {
            help[index++] = arr[p1++];
        }
        while (p2 <= right) {
            help[index++] = arr[p2++];
        }
        for (int i = 0; i < help.length; i++) {
            arr[left + i] = help[i];
        }
    }

    public static void main(String[] args) {
        MyMergeSort myMergeSort = new MyMergeSort();
        int[] arr = {10,20,30,10,5,6,7,8,9,10};
        int n = arr.length - 1;
        myMergeSort.sort(arr, 0, n);
        System.out.println(Arrays.toString(arr));
    }
}
