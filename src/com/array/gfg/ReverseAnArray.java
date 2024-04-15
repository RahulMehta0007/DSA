package com.array.gfg;

public class ReverseAnArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        arr=reverseAnArray(arr);
       for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static int[] reverseAnArray(int [] arr){
        int low=0,high=arr.length-1;
        while(low<high){
            arr[low]=arr[low]^arr[high];
            arr[high]=arr[low]^arr[high];
            arr[low]=arr[low]^arr[high];
            low++;
            high--;
        }
            return arr;
    }
}
