package com.qmm.hw;

import java.util.*;

public class Test2 {

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int i =0;
        List<Integer> list = new ArrayList<>();
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            i++;
            int a = in.nextInt();
            list.add(a);

            if(list.size()==10){
                break;
            }
        }
        int res = getMingResult(list);
        System.out.println(res);*/
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (in.hasNextInt()) {
            int a = in.nextInt();
            list.add(a);
            if(list.size()==10){
                break;
            }
        }
        Collections.sort(list);
        int res = list.get(0)*list.get(0)+list.get(0)*list.get(9)-list.get(9)*list.get(9)+list.get(1);
        System.out.println(res);
    }

    public static int getMingResult(List<Integer> list){

        Collections.sort(list);

        return list.get(0)*list.get(0)+list.get(0)*list.get(9)-list.get(9)*list.get(9)+list.get(1);
    }
}
