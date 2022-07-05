package com.Algorithm.binarySearch;

public class BinarySearchDemo2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = BinarySearchDemo2.binarySearch(arr, 0, 0, 9);
        System.out.println("index = " + result);
    }


    public static int binarySearch(int[] arr, int target, int left, int right) {
        int mid = (left + right) / 2;
        if (arr[mid] == target) {
            return mid;
        }
         else if (arr[mid] > target && left < right) {
            return binarySearch(arr, target, left, mid - 1);
        } else if (arr[mid] < target && left < right) {
            return binarySearch(arr, target, mid + 1, right);
        }
        return -1;
    }
}
