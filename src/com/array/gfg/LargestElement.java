package com.array.gfg;

public class LargestElement {
    public static void main(String[] args) {
        int [] arr={10,5,20,8};
        System.out.println(getLargestElement(arr));
    }

    public static int getLargestElement(int [] arr){
        int max=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}
