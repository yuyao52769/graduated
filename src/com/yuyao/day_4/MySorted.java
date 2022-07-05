package com.yuyao.day_4;


import java.util.Arrays;

public class MySorted {

    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) /2 ;
            mergeSort(arr, left, mid, temp);
            mergeSort(arr, mid+1, right, temp);
            merge(arr, left, right, mid, temp);
        }
    }


    /*/
    归并排序，先将数组分开至为长度为1，然后逐个合并
     */
    public static void merge(int[] arr, int left, int right, int mid, int[] temp) {
        int t = 0;
        int i = left;
        int j = mid + 1;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j] ) {
                temp[t] = arr[i];
                t ++;
                i ++;
            } if (arr[i] > arr[j] ){
                temp[t] = arr[j];
                t ++;
                j ++;
            }
        }
        while (i <= mid) {
            temp[t] = arr[i];
            i ++;
            i ++;
        }
        while (j <= right) {
            temp[t] = arr[j];
            j ++;
            t ++;
        }
        t = 0;
        while (left <= right) {
            arr[left] = temp[t];
            t ++;
            left ++;
        }
    }

    /*
    快速排序，递归方法，将小于某个数至于左边，大于某个数至于右边
     */
    public static void quickSort_2(int[] arr, int low, int high) {
        if (low > high) {return;}
        int i = low;
        int j = high;
        int temp = arr[low];
        while (i < j) {
            while (arr[j] >= temp && i < j) {
                j --;
            }
            while (arr[i] <= temp && i < j) {
                i ++;
            }
            if (i < j) {
                arr[i] = arr[i] ^ arr[j];
                arr[j] = arr[i] ^ arr[j];
                arr[i] = arr[i] ^ arr[j];
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort_2(arr, low, i-1);
        quickSort_2(arr, j+1, high);
    }

    /*
    快速排序，递归方法，将小于某个数至于左边，大于某个数至于右边
     */
    public static void quickSort(int[] arr, int left, int right) {
        int pivot = (left + right) / 2;
        while (left < right) {
            while ( arr[left] < arr[pivot] || (arr[left] < arr[pivot] && arr[right]== arr[pivot])) {
                left ++;
            }
            while (arr[right] > arr[pivot] || (arr[right] > arr[pivot] && arr[left]== arr[pivot])) {
                right --;
            }
            if (left > right) {
                break;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

    }

    public static void newShellSort(int[] arr)  {
        int gap = arr.length;
        while (true) {
            gap /= 2;
            if (gap == 0) {break;}
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    arr[j] = temp;
                }
            }
        }

    }

    public static void shellSort(int[] arr) {
        int gap = arr.length;
        while (true) {
            gap = gap / 2;
            if (gap == 0) {break;}
            for (int i = gap; i < arr.length; i ++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        swap(arr, j, j+gap);
                    }
                }
            }
        }
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i ++) {
           int insertValue = arr[i];
           int insertIndex = i - 1;
           while (insertIndex >= 0 && insertValue < arr[insertIndex]) {
               arr[insertIndex + 1] = arr[insertIndex];
               insertIndex --;
           }
            arr[insertIndex + 1] = insertValue;
        }
    }

    public static void bubbleSort(int[] arr) {
        boolean isChange = false;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j ++){
                if (arr[j] > arr[j+1]) {
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                    isChange = true;
                } else {isChange = false;}
            }
            if (!isChange) {break;}
            else {isChange = false;}
        }
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr,i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
//        arr[i] = arr[i] ^ arr[j];
//        arr[j] = arr[i] ^ arr[j];
//        arr[i] = arr[i] ^ arr[j];
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {
        int[] test = new int[]{-9, 78, 0, 23, -567, 70};
//        MySorted.quickSort_2(test, 0, 5);
        int[] temp = new int[test.length];
        MySorted.mergeSort(test, 0, 5, temp);
        System.out.println(Arrays.toString(test));

    }
}
