package com.qmm.hw;

import java.util.HashMap;
import java.util.Map;

public class Test20200328 {

    public static void main(String[] args){
        long[][] a = {{8,10},{8,9}};

            int max = 1;
        for(int i = 0;i<a.length;i++){
            int count = 1;
           for(int j = i+1;j<a.length;j++){
               if(a[i][1]>a[j][0] && a[i][1]<=a[j][1] && a[i][0]<=a[j][0]
                       ||(a[i][1]-a[i][0]>a[j][1]-a[j][0])){
                   count++;
                   if(count>max){
                       max = count;
                   }
               }
           }

        }
        System.out.println(max);
    }

}
