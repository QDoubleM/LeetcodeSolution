package com.qmm.baidu;

import java.util.Scanner;

public class MaxLengthStr {

    public static void main(String[] args){
        String a ="nddemdereeeffetcssssfggddregg";
        String b ="";
        int count =1;
        int start = 0;
        char s = a.charAt(0);
        int max = 1;
        char res = a.charAt(0);
        for(int i = 1;i<a.length();i++){
            if(a.charAt(i) == s){
                count++;
                if(count>max){
                    s = a.charAt(i);
                    max = count;
                    res = a.charAt(i);
                }
            }else {
                //max =1;
                count=1;
                s = a.charAt(i);
            }
        }
        System.out.println(res);
    }
}
