package com.array.striver;

import java.util.LinkedList;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 5, 11};
        int[] arr2 = {2, 3, 4, 4, 5, 6, 7, 8, 9};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;
        List<Integer> al = new LinkedList<Integer>();


        while (i < n1 && j < n2) {

            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                al.add(arr1[i]);
                i++;
                j++;

            }

        }


        for (int x : al)
            System.out.print(x + " ");


    }
}
