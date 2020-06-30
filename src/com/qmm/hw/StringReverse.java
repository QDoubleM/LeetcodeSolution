package com.qmm.hw;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args){
        System.out.println(solution(670));
    }
    public static int solution(int N) {
        // write your code in Java SE 8
        int s = N>=0?N:(0-N);
        String t = String.valueOf(s);
        int index = 0;
        if(N>=0){
            for(int i = 0;i<t.length();i++){
                char c = t.charAt(i);
                if(c<=Character.forDigit(5,10)){
                    index = i;
                    break;
                }
            }
            if(index == 0){
                return Integer.parseInt(5+t);
            }else{
                t = t.substring(0,index)+"5"+t.substring(index,t.length());
                return Integer.parseInt(t);
            }
        }else{
            for(int i = 0;i<t.length();i++){
                char c = t.charAt(i);
                if(c>=(char)5){
                    index = i;
                    break;
                }
            }
            if(index == 0){
                return 0-Integer.parseInt(N+t);
            }else{
                t = t.substring(0,index)+N+t.substring(index,t.length());
                return 0-Integer.parseInt(t);
            }
        }
    }
}
