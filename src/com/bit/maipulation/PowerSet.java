package com.bit.maipulation;
import java.util.*;
public class PowerSet {

    /*
    Print all subsets
    nums[1,2,3]
     */
    public static void main(String[] args) {
        String str="abc";
        powerSet(str);

    }

    public static void powerSet(String str){

        int totalSets=1<<str.length();
        List<String> subset;
        List<List<String>> superList=new ArrayList<List<String>>();
        for(int i=0;i<totalSets-1;i++) {
            subset = new ArrayList<String>();
            for (int j = 0; j < str.length() - 1; j++) {
                if ((i & (1 << j)) != 0)
                    subset.add(str.charAt(j) + "");
            }
            superList.add(subset);

        }

    }

}
