package com.yuyao.Day2022;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9,2,6,5,8,10};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }


    public void sort(int[] arr){
        if (arr == null || arr.length == 0) {
            return;
        }
        int length = arr.length;
        heapMax(arr, length);
        for (int i = length-1; i>=0; i--) {
            swap(arr, 0, i);
            length--;
            heapMax(arr, length);
        }
    }

    public void heapMax(int[] arr, int length) {
        for (int i = (int)Math.floor(length/2)-1; i >= 0; i--){
            heap(arr, i, length);
        }
    }

    /**
     *
     * @param arr 想要排序的数组，也即堆
     * @param i   当前的非叶子节点的索引(堆顶为0)
     * @param length 数组的长度
     */
    public void heap(int[] arr, int i, int length){
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int largestIndex = i;
        if (left < length && arr[left] > arr[largestIndex]) {
            largestIndex = left;
        }
        if (right < length && arr[right] > arr[largestIndex]) {
            largestIndex = right;
        }

        if (largestIndex != i) {
            swap(arr, i, largestIndex);
            heap(arr, largestIndex, length);
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
