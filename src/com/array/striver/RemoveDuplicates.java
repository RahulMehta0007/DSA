package com.array.striver;

public class RemoveDuplicates {
    public static void main(String[] args) {
    int [] arr=new int []{1,1,2,2,2,3,3,4,5};
        removeDuplicates(arr);
    }

    public static void removeDuplicates(int [] arr){
        int pointer=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1]){
                pointer++;
                arr[pointer]=arr[i+1];
            }
        }
        for (int i = 0; i <=pointer; i++) {
            System.out.println(arr[i]);
        }

    }
}
