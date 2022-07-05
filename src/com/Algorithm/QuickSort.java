package com.Algorithm;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.Arrays;

public class QuickSort {

    public void sort(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        if (arr.length <= 1) {
            return;
        }
        quickSort(arr, start, end);
    }

    public void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int boundary = partition(arr, start, end);
            if (boundary -1  >= start) {
                quickSort(arr, start, boundary-1);
            }
            if (boundary + 1 <= end) {
                quickSort(arr, boundary+1, end);
            }
        }
    }

    public int partition(int[] arr, int start, int end) {
        int random =(int)(Math.random()*(end - start + 1)) + start;
        swap(arr, random, end);
        int temp = arr[end];
        int l = start;
        int r = end;
        while (l < r) {
            while (l < r && arr[l] <= temp) {l++;}
            while (l < r && arr[r] > temp) {r--;}
            if (l < r) {
                swap(arr, l, r);
            }
        }
        arr[end] = arr[l];
        arr[l] = temp;
        return l;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void sort2(int[] arr, int start, int end) {
        int random = (int)(Math.random()*(end - start + 1)) + start;
        int compare = arr[random];
        int i = start;
        int j = end;
        while (i < j) {
            while (i < j && arr[i] <= compare) {i++;}
            while (i < j && arr[j] > compare) {j--;}
            swap(arr, i, j);
        }
        i = arr[i] <= compare? i : i + 1;
        if (i  >= start) {
            sort2(arr, start, i);
        }
        if (i + 1 <= end) {
            sort2(arr, i + 1, end);
        }
    }

    public  int[] qsort(int arr[],int start,int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i<j) {
            while ((i<j)&&(arr[j]>pivot)) {
                j--;
            }
            while ((i<j)&&(arr[i]<pivot)) {
                i++;
            }
            if ((arr[i]==arr[j])&&(i<j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i-1>start) arr=qsort(arr,start,i-1);
        if (j+1<end) arr=qsort(arr,j+1,end);
        return (arr);
    }

    public  void quickSort_2(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        int i = low;
        int j = high;
        int random = (int)(Math.random()*(high - low + 1)) + low;
        int temp = arr[random];
        while (i < j) {
            while (arr[j] > temp && i < j) {
                j--;
            }
            while (arr[i] <= temp && i < j) {
                i++;
            }
            if (i < j) {
                arr[i] = arr[i] ^ arr[j];
                arr[j] = arr[i] ^ arr[j];
                arr[i] = arr[i] ^ arr[j];
            }
        }
        quickSort_2(arr, low, i - 1);
        quickSort_2(arr, i + 1, high);
    }

    public void Quick_Sort(int[] arr, int begin, int end){
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


    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        int[] arr = {10,20,30,10,5,6,7,8,9,10};
        int n = arr.length - 1;
        sort.sort(arr);
        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < 100; i++) {
//            int random =(int)(Math.random()*(2 - 1 + 1)) + 1;
//            System.out.print(random + " ; ");
//        }
    }
}
