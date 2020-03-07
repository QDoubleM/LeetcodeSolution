package com.qmm.hw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PrintOrder {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        while(in.hasNext())
        {
            String str=in.nextLine();
            String[] strs=str.split(",");
            // 数组有可能为零
            if(strs.length>0)
            {
                Integer [] ints=new Integer[strs.length];
                int vi[]=new int[ints.length];

                for(int i=0;i<strs.length;i++)
                {
                    ints[i]=Integer.parseInt(strs[i]);// 无序的数组

                }

                //降序排序，9 3 3 5
                Arrays.sort(ints,new Comparator<Integer>(){

                    @Override
                    public int compare(Integer arg0, Integer arg1) {
                        // TODO Auto-generated method stub
                        return arg1-arg0;
                    }

                });

                StringBuilder sb=new StringBuilder();
                // 输出所在的坐标
                for(int j=0;j<strs.length;j++)
                {
                    int c=Integer.parseInt(strs[j]);
                    int k=0;
                    while(k<ints.length)
                    {
                        if(c==ints[k] && vi[k]==0)
                        {
                            vi[k]=1;
                            break;
                        }
                        k++;
                    }

                    sb.append(k+",");
                }
                System.out.println(sb.substring(0,sb.length()-1));
            }
        }
    }
}
