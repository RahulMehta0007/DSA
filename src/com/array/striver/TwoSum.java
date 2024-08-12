package com.array.striver;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        twoSumMapApproach();
        twoSum2PointerApproach();
    }

    private static void twoSumMapApproach() {
        int [] arr={2,7,11,15};
        int target=9;
        Map<Integer,Integer> map=new HashMap<>();
        int [] indexes=new int[2];
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(target-arr[i])){
                System.out.println(i+" , "+map.get(target-arr[i]));
                indexes[0]=i;
                indexes[1]=map.get(target-arr[i]);
            }
            map.put(arr[i],i);

        }
    }

    private static void twoSum2PointerApproach() {
        int [] arr={2,5,6,8,11};
        int target=14;
        int i=0;
        int j=arr.length-1;
        for (; i <arr.length ;) {
            if(arr[i]+arr[j]==target){
                System.out.println(i+" ,"+j);
                break;
            } else if (arr[i]+arr[j]<target) {
                i++;
            }else {
                j--;
            }
        }
    }
}
