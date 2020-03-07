package com.qmm.leetcode.second;

/**
 * 1109. 航班预订统计
 * 这里有 n 个航班，它们分别从 1 到 n 进行编号。
 *
 * 我们这儿有一份航班预订表，表中第 i 条预订记录 bookings[i] = [i, j, k] 意味着我们在从 i 到 j 的每个航班上预订了 k 个座位。
 *
 * 请你返回一个长度为 n 的数组 answer，按航班编号顺序返回每个航班上预订的座位数。
 *
 *
 *
 * 示例：
 *
 * 输入：bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
 * 输出：[10,55,45,25,25]
 *
 */

public class Second1109 {
    public static void main(String[] args){
        int[][] bookings = {{1,2,10},{2,3,20},{2,5,25}};
        int n = 5;
        corpFlightBookings(bookings,5);
    }


    public static int[] corpFlightBookings(int[][] bookings, int n) {
        System.out.println(bookings.length);
        int[] res  = new int[n];
        for(int i = 0;i<bookings.length;i++){
            int no1 = bookings[i][0];
            int no2 = bookings[i][1];
            int count = bookings[i][2];
            for(int j = no1-1;j<=no2-1;j++ ){
                res[j] = res[j]+count;
            }
        }
        return res;
    }

}
