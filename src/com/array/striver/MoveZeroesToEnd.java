package com.array.striver;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int [] arr={0,1,0,2,0,3,0,4,0,5,0};
        int pointer=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=0){
                int temp=arr[pointer];
                arr[pointer]=arr[i];
                arr[i]=temp;
                pointer++;
            }
        }
        for (int i = 0; i <arr.length-1 ; i++) {
            System.out.println(arr[i]);
        }
    }
}
