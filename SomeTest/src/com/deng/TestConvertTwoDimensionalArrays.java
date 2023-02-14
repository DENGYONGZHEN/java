package com.deng;

import java.util.Arrays;

/**
 * @Classname TestConvertTwoDimensionalArrays
 * @Description 转换二维数组，行和类之间转换
 * @Version 1.0.0
 * @Date 2023/2/14 20:58
 * @Created by helloDeng
 *
 *
 * 打印出一个 M 行 N 列的二维数组的转置（交换行和列）
 */
public class TestConvertTwoDimensionalArrays {
    public static void main(String[] args) {
        //一维数组的顺序翻转
    /*    int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.println(i);*/

        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j];
            }
        }
        a=b;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
