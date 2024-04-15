package com.array.gfg;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr={20,20,8,12};
        System.out.println(getSecondLargestElement(arr));
    }
    public static int getSecondLargestElement(int [] arr){
        int max=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max) {
                secondLargest=max;
                max = arr[i];

            }
            if(arr[i]>secondLargest && arr[i]<max){
                secondLargest=arr[i];
            }

        }
        return secondLargest;

    }
}
