package com.bit.maipulation;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        System.out.println("Answer"+divideTwoIntegers(7,-3));
    }
    public static int divideTwoIntegers(int divident,int divisor){

        boolean sign=true;
        long absDivident=Math.abs((long)divident);
        long absDivisor=Math.abs((long)divisor);
        int powerOfTwo=0;
        int answer=0;

        if(divident==divisor)
            return 1;
        if(divident>0 && divisor<0) sign=false;
        if(divident<0 && divisor>0) sign=false;


        while(absDivident>=absDivisor){
            powerOfTwo=0;
            while(absDivident >= (absDivisor<<(powerOfTwo+1) ) ){
                powerOfTwo++;
            }
            answer+=(1<<powerOfTwo);
            absDivident-=(absDivisor<<powerOfTwo);

        }

        if( answer == (1<<31) && sign)
            return  Integer.MAX_VALUE;
        if( answer == (1<<31) && !sign)
            return  Integer.MIN_VALUE;

        return sign ?answer:-answer;
    }

}
