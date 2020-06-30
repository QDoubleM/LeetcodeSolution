package com.qmm.hw;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args){
        String a ="";
        String b ="";
        Scanner in = new Scanner(System.in);
        a = in.nextLine();
        b = in.nextLine();

        String[] sa = a.split(" ");

        String temp = "";
        for(int i=0;i<sa.length;i++){
            String t = sa[i].trim();
            if(t.equals("")){
                continue;
            }else {
                temp = temp+sa[i];
            }
        }
        int count =0;
        int start = 0;
        boolean finish = false;
        for(int i = 0;i<temp.length();){
            for(int j = start;j<=temp.length();j++){
                String s = temp.substring(i,j);
                start=j;
                if(s.contains(b)){
                    count++;
                    break;
                }

            }
            i=start-1;
        }
        System.out.println(count);
    }
}
