package com.array.gfg;


public class RemoveDuplicatesFromSortedArray {

    // Remove duplicates and return size
    public static void main(String[] args) {
        int []arr={1,2,2,3,3,4,4,4,4};
        System.out.println(removeDuplicatesAndReturnSize(arr));

    }

    public static int removeDuplicatesAndReturnSize(int [] arr){
        int result=1;
        for (int i = 1; i < arr.length; i++) {

            if(arr[i]!=arr[result-1]){
                arr[result]=arr[i];
                result++;
            }

        }

        for (int i = 0; i < result; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        return result;
    }

}
