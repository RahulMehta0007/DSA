package com.bit.maipulation;

public class XorLToR {
    public static void main(String[] args) {
        System.out.println(lToR(4,8));
    }

    public static int lToR(int l,int r){
    return xor(l-1) ^ xor(r);
    }
    public static int xor(int n){
        if(n%4==1) return 1;
       else if(n%4==2) return n+1;
       else if(n%4==3) return 0;
        else
            return n;
    }

}
