package com.yuyao.day1;

import java.util.ArrayList;

public class BubbleSort {

    public static int[] sort_1(int[] arr) {
        if (isEmptyOrOnlyTwo(arr)) {return arr;}
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                  swap(arr, j);
                }
            }
        }
        return arr;
    }

    public static int[] sort_2(int[] arr) {
        if (isEmptyOrOnlyTwo(arr)) {return arr;}
        boolean isSwap = false;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j);
                    isSwap = true;
                }
            }
        }
        return arr;
    }

    public static ArrayList<Integer> quickSort_1(ArrayList<Integer> arr) {
        if (arr.size() < 2) { return arr; }
        int mid = arr.get(0);
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) <= mid) {
                left.add(arr.get(i));
            }
            else {
                right.add(arr.get(i));
            }
        }
        return addAll(quickSort_1(left), quickSort_1(right), mid);

    }

    public static ArrayList<Integer> addAll(ArrayList<Integer> list_1, ArrayList<Integer> list_2, int mid) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < list_1.size(); i ++) {
            newArr.add(list_1.get(i));
        }
        newArr.add(mid);
        for (int i = 0; i < list_2.size(); i ++) {
            newArr.add(list_2.get(i));
        }
        return newArr;
    }

    public static int dcSum(int [] arr) {
        int sum = 0;
        if (arr.length == 1 || arr.length == 0) {return sum+=arr[0];}
        else {
            return sum += arr[0] + dcSum(deleteFirstItem(arr));
        }
    }

    public static int[] deleteFirstItem(int[] arr) {
        int[] newArr = new int[arr.length-1];
        for(int i = 0; i < arr.length-1; i++) {
            newArr[i] = arr[i+1];
        }
        return newArr;
    }

    public static int binarySearch(int[] arr, int find) {
        int low = 0;
        int high = arr.length - 1;
        while(true) {
            int mid = (low + high) / 2;
            if (find < arr[mid]) {
                high = mid;
            } else if (find > arr[mid]){
                low = mid;
            } else {
                return mid; }
            if (low == high - 1) {
                return find == arr[low] ? low : high;
            }

        }
    }

    public static void swap(int[] newArr, int i) {
        int temp;
        temp = newArr[i];
        newArr[i] = newArr[i+1];
        newArr[i+1] = temp;
    }

    public static boolean isEmptyOrOnlyTwo(int[] arr) {
        if (arr == null || arr.length < 2) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
//        int[] test =new int[]{1,2,3,4,5,6,7,8,9,10};
        /*BubbleSort bSort = new BubbleSort();
        int[] arr = BubbleSort.sort_1(test);
        for (int i: arr
             ) {
            System.out.print(i + " ");
        }*/
//        System.out.println("========");
//        System.out.println(BubbleSort.binarySearch(test, 10));
//        System.out.println( (5+4)/2);
//        int[] test = new int[100];
//        for (int i = 0; i < 100; i++) {
//            test[i] = i;
//        }
//        for (int j = 0; j< 100; j++) {
//            System.out.print( BubbleSort.binarySearch(test, j)+" ");
//        }
//        System.out.println(BubbleSort.dcSum(test));
        ArrayList<Integer> test = new ArrayList<>();
        test.add(5);
        test.add(1);
        test.add(4);
        test.add(3);
        test.add(7);
        test.add(5);
        test.add(21);
        test.add(1);
        test.add(6);
        ArrayList<Integer> test_1 = BubbleSort.quickSort_1(test);
        System.out.println(test_1);
    }

}
