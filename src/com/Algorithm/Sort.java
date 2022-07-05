package com.Algorithm;

import sun.security.x509.EDIPartyName;

import java.awt.event.HierarchyBoundsAdapter;
import java.util.Arrays;

public class Sort {

    public void sort1(int[] arr, int begin, int end) {
        if (begin > end) {
            return;
        }
        int i = begin;
        int j = end;
        int temp = arr[begin];
        while (i != j) {
            while (i < j && arr[j] > temp) {
                j--;
            }
            while ( i < j && arr[i] <= temp) {
                i++;
            }
            if (i < j) {
                int a = arr[i];
                arr[i] = arr[j];
                arr[j] = a;
            }
        }

        arr[begin] = arr[i];
        arr[i] = temp;
        sort1(arr, begin, i-1);
        sort1(arr, i+1, end);
    }

    void Quick_Sort(int[] arr, int begin, int end){
        if(begin > end)
            return;
        int tmp = arr[begin];
        int i = begin;
        int j = end;
        while(i != j){
            while(arr[j] >= tmp && j > i)
                j--;
            while(arr[i] <= tmp && j > i)
                i++;
            if(j > i){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[begin] = arr[i];
        arr[i] = tmp;
        Quick_Sort(arr, begin, i-1);
        Quick_Sort(arr, i+1, end);
    }

    public void sort2(int[] arr, int begin, int end) {
        if (begin > end) {
            return;
        }
        int i = begin;
        int j = end;
        int random = (int)(Math.random()*(end - begin + 1)) + begin;
        swap(arr, begin, random);
        int temp = arr[begin];
        while (i != j) {
            while (i < j && arr[j] > temp) {
                j--;
            }
            while (i < j && arr[i] <= temp) {
                i++;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        arr[begin] = arr[i];
        arr[i] = temp;
        sort2(arr, begin, i - 1);
        sort2(arr, i + 1, end);
    }

    public void swap(int[] arr, int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        Sort mySort = new Sort();
        int[] arr = {10,20,30,10,10,6,7,8,9,10};
        int n = arr.length - 1;
        mySort.sort2(arr, 0, n);
        System.out.println(Arrays.toString(arr));
    }
}
