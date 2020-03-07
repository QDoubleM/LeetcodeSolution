package com.qmm.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCount {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        String s = sc.nextLine().toString();
        char[] c = s.toCharArray();
        List<String> list = new ArrayList<>();
        for(int i = 0;i<c.length;i++){
            int asc = c[i];
            if(0<asc && 127>asc && !list.contains(String.valueOf(c[i]))){
               list.add(String.valueOf(c[i]));
            }
        }
        System.out.print(list.size());
    }
}
