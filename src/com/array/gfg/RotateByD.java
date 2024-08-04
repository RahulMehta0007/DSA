package com.array.gfg;

public class RotateByD {
    public static void main(String[] args) {

        //naiveApproach();
        int [] arr={1,2,3,4,5};
        int d=3;
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }


    }
    public static void reverse(int []arr,int start,int end){
            while(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
    }

    private static void naiveApproach() {
        int [] arr= {1,2,3,4,5};
        int rotateBy=2;
        for(int i=0;i<rotateBy;i++) {
            int last=arr[0];
            for(int j=0;j<arr.length-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=last;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
