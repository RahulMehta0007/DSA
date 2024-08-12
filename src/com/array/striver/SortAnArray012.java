package com.array.striver;

public class SortAnArray012 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0};
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr,low,mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                    mid++;
            } else {
                    swap(arr,mid,high);
                    high--;
            }
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void swap(int [] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
