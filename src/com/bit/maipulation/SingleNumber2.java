package com.bit.maipulation;

import java.util.Arrays;

public class SingleNumber2 {
    public static void main(String[] args) {
        int []nums={1,2,2,2};
        //System.out.println(singleNumber2(nums));
        System.out.println(striverSolution(nums));
    }

    public static int singleNumber2(int [] nums){

        Arrays.sort(nums);
        for(int i=1;i<nums.length;i+=3){
               if (nums[i] != nums[i - 1])
                   return nums[i - 1];
           }
        return nums[nums.length-1];
    }

    public static int striverSolution(int [] nums){
        int ones=0;
        int twos=0;

        for(int i=0;i<nums.length;i++){
            ones=((nums[i]^ones)& ~twos);
            twos=((nums[i]^twos)& ~ones);

            System.out.println("ones: "+ones);
            System.out.println("twos: "+twos);
        }
        return ones;
    }

}
