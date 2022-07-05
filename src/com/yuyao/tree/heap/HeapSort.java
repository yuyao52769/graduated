package com.yuyao.tree.heap;

public class HeapSort {

    public static void main(String[] args) {
//        int[] arr = new int[]{4, 6, 8,5, 9};
//        heapSort(arr);
//        System.out.println(Arrays.toString(arr));
        int[] arr = new int[8000000];
        for (int i = 0; i < 8000000; i ++) {
            arr[i] = (int)(Math.random()*8000000);
        }

        long start = System.currentTimeMillis();
        heapSort(arr);
        long end = System.currentTimeMillis();
        System.out.println(end - start);


    }

    public static void heapSort(int[] arr) {
        int temp = 0;
        for (int i = arr.length/2-1; i >= 0; i --) {
            adjustHeap(arr, i, arr.length);
        }

        for (int j = arr.length-1; j > 0; j --) {
            temp = arr[j];
            arr[j] = arr[0];
            arr[0] = temp;
            adjustHeap(arr, 0, j);
        }
    }

    /**
     * function:      完成 将以i指向的非叶子节点的树调整为大顶堆
     * @param arr     待调整的数组
     * @param i       非叶子节点在数组的索引
     * @param length  对多少个元素进行调整，length逐渐在减小
     */
    public static void adjustHeap(int[] arr, int i, int length) {
        int temp = arr[i];
        for (int k = i * 2 + 1; k < length; k = k*2 + 1) {
            if ((k + 1) < length && arr[k] < arr[k+1]) { k++;}
            if (arr[k] > temp) {
                arr[i] = arr[k];
                i = k;
            } else {break;}
         }
        arr[i] = temp;
    }
}
