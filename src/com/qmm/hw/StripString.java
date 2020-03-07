package com.qmm.hw;

import java.util.Scanner;

public class StripString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            printStr(sc.nextLine().toString());
        }
    }

    public static void printStr(String str){
        String a = "00000000";
        while(str.length()>=8){
            System.out.println(str.substring(0,8));
            str = str.substring(8,str.length());
        }
        if(str.length()>0){
            System.out.println(str+a.substring(0,8-str.length()));
        }
    }
}
