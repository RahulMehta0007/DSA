package com.array.striver;

import java.util.HashMap;

public class SubarrayWithSumK {
    public static void main(String[] args) {

      //  int [] nums={1,1,1 };
        int [] nums={9, 4, 20, 3, 10, 5};
        int k=33;
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum==k)
                count++;
            if (map.containsKey(sum - k))
                count += map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
            System.out.println("count: "+count+map+" ");
        }

    }
}
