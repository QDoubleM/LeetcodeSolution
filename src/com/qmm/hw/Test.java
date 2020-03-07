package com.qmm.hw;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        long res = 0;
        if(num == 0){
            System.out.print(res);
        }
        while(num != 0){
            res = res*10+num%10;
            num = num/10;
        }
        if(res>Math.pow(2,31)-1 || res<-1*Math.pow(2,31)){
            System.out.print(0);
        }else {
            System.out.print((int)res);
        }

    }

}
