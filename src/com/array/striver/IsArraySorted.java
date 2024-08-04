package com.array.striver;

public class IsArraySorted {
    public static void main(String[] args) {
        int [] arraySorted=new int []{1,2,2,3,3,4};
        int [] arrayNotSorted=new int []{1,2,1,3,4};
        System.out.println(isArraySorted(arraySorted));
        System.out.println(isArraySorted(arrayNotSorted));
    }

    public static boolean isArraySorted(int [] arr){

        boolean flag=false;
        for (int i = arr.length-1; i >0; i--) {
            if(arr[i]>=arr[i-1]){
                flag=true;
            }
            else {
                flag = false;
                break;
            }}

        return flag;
    }
}
