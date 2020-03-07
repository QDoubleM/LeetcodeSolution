package com.qmm.hw;

import java.util.Scanner;

public class NumberOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.nextLine();
            sort(str);
        }
        scan.close();
    }

    private static void sort(String str) {
//去掉空格，保存数字
        int str_length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str_length; i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            }
        }
        char[] num = sb.toString().toCharArray();
        int length = num.length;
        int part_length = length / 2;//保存一半数字，按照奇数偶数保存
        char[] odd;
        char[] even;
//偶数个数字
        if (length % 2 == 0) {
            odd = new char[part_length];
            even = new char[part_length];
        } else {
//奇数个数字,多一个奇数
            odd = new char[part_length + 1];
            even = new char[part_length];
        }
        int index_odd = 0;
        int index_even = 0;
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                odd[index_odd++] = num[i];
            } else {
                even[index_even++] = num[i];
            }
        }
        ascendingSort(odd);//奇数位升序
        descendingSort(even);//偶数位降序  
        for (int i = 0; i < index_even; i++) {
            if (i == 0) System.out.print(odd[i] + " " + even[i]);
            else System.out.print(" " + odd[i] + " " + even[i]);
        }
        if (index_odd != index_even) {
            System.out.println(" " + odd[index_odd - 1]);
        }
    }

    private static void ascendingSort(char[] data) {
        int length = data.length;
        char temp = '*';
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (data[i] > data[j]) {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    private static void descendingSort(char[] data) {
        int length = data.length;
        char temp = '*';
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (data[i] < data[j]) {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
}