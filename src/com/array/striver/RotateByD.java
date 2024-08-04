package com.array.striver;

public class RotateByD {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        //rotateByDplacesBetter(arr,3);
        rotateByDplacesOptimal(arr,3);
        //reverse(arr,0,arr.length-1);

    }
    public static  void rotateByDplacesBetter(int [] arr,int d){
        // Step 1
        int n=arr.length;
        d=d%n;

        //Step 2:[] Temporary Array
        int [] temp=new int[d];
        for (int i = 0; i < d; i++) {
            temp[i]=arr[i];
        }

        // Step 3 : Shifting elements
        int j=0;
        for (int i = d; i < n; i++) {
            arr[j]=arr[i];
            j++;
        }

        // Step 4 Add Temp array back
        int k=0;
        for (int i = n-d; i <n ; i++) {
            arr[i]=temp[k];
            k++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    public static  void rotateByDplacesOptimal(int [] arr,int d){
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int [] arr,int start, int end){
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
