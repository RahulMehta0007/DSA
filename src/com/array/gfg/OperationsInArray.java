package com.array.gfg;

public class OperationsInArray {
    public static void main(String[] args) {
        int [] arr=new int [3];
        arr[0]=1;
        arr[1]=2;
        arr=insert(arr,2,3,3,1);

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int [] arr2={3,8,12,5,6};
        arr2=delete(arr2,6 );

        for (int i = 0; i <arr2.length ; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }

    public static int[] insert(int [] arr,int size,int capacity,int num,int pos){

        if(capacity==size)
            return arr;
        int index=pos-1;

        for(int i=size-1;i>=index;i--){
            arr[i+1]=arr[i];
        }

        arr[index]=num;
        return arr;
    }

    public static int[] delete(int [] arr,int elemDel){
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(elemDel==arr[i]){
                index=i;
                arr[index]=0;
                break;
            }
        }

        for (int i = index; i < arr.length-1 ; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        return arr;
    }

}
