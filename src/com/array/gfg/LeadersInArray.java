package com.array.gfg;

public class LeadersInArray {
    public static void main(String[] args) {
        int [] arr={4,10,7,10,6,5,2};
        int currentLeader=arr[arr.length-1];
        System.out.print(currentLeader+" ");
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>currentLeader){
                currentLeader=arr[i];
                System.out.print(currentLeader+" ");
            }
        }
    }
}
