package com.array.striver;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        majorityElementMaps();
        majorityElementMooreVoting();
    }

    private static void majorityElementMooreVoting() {
        int [] arr={2,2,3,3,1,2,2,1,1,1,1,1};
        int count=0;
        int el=0;
        for (int i = 0; i < arr.length; i++) {

            if(count==0){
                el=arr[i];
                count++;
            }else if(arr[i]!=el) {
                count--;
            }
            else{
                count++;
            }
        }
        System.out.println(el);
    }

    private static void majorityElementMaps() {
        int [] arr={2,2,3,3,1,2,2,1,1,1,1,1};
        int maxCount=Integer.MIN_VALUE;
        int value=0;
        Map<Integer,Integer> map=new HashMap();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                int countValue= map.get(arr[i]);
                if(countValue>maxCount){
                    maxCount=countValue;
                    value=arr[i];
                }
                map.put(arr[i],countValue+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        if(map.size()==1)
            value=arr[0];

        System.out.println(value);
    }
}
