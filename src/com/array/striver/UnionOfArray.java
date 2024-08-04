package com.array.striver;

import java.util.*;

public class UnionOfArray {
    public static void main(String[] args) {
        int [] arr1={1,1,2,3,5,11};
        int [] arr2={2,3,4,4,5,6,7,8,9};
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0,j=0;
        List<Integer> al= new LinkedList<Integer>();

        while(i<n1 && j<n2){

            if(arr1[i]<=arr2[j]){

                if( al.isEmpty() || ! al.contains(arr1[i]) ){
                    al.add(arr1[i]);
                }
                i++;

            }else{
                if( al.isEmpty() || ! al.contains(arr2[j]) ){
                    al.add(arr2[j]);
                }
                j++;
            }
        }

        while(j<n2){
            if( al.isEmpty() || ! al.contains(arr2[j]) ){
                al.add(arr2[j]);
            }
                j++;
            }

        while(i<n1){
            if( al.isEmpty() || ! al.contains(arr1[i]) ){
                al.add(arr1[i]);
            }
                i++;
            }


        for (int x:al)
            System.out.print(x+" ");
    }
}
