package com.Algorithm;

import com.yuyao.day_4.Test_5;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;

public class MergeSort {

    public void sort(int[] arr, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = left +((right-left)>>1);
        sort(arr, left, mid);
        sort(arr, mid+1, right);
        merge(arr, left, mid, right);
    }

    public void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right-left+1];
        int index = 0;
        int i = left;
        int j = mid+1;
        while ( i <= mid && j <= right) {
          temp[index++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        while (i <= mid) {
            temp[index++] = arr[i++];
        }
        while (j <= right) {
            temp[index++] = arr[j++];
        }
        for (int k = 0; k < temp.length; k++) {
            arr[left + k] = temp[k];
        }
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {10,20,30,10,5,6,7,8,9,10};
        int n = arr.length-1;
        mergeSort.sort(arr, 0, n);
        System.out.println(Arrays.toString(arr));
    }
}
