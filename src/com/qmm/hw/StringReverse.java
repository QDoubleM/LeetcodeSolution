package com.qmm.hw;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toString();
        StringBuffer sb = new StringBuffer();
        for (int i = s.length(); i > 0; i--) {
            sb.append(s.substring(i - 1, i));
        }
        System.out.println(sb.toString());


    }
}
