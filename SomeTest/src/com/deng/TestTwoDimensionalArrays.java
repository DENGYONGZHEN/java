package com.deng;

/**
 * @Classname TestTwoDimensionalArrays
 * @Description 二维数组
 * @Version 1.0.0
 * @Date 2023/2/14 20:43
 * @Created by helloDeng
 */
public class TestTwoDimensionalArrays {
    public static void main(String[] args) {
        boolean [][] b = {{false,true,true},{true,true,true},{false,true,false}};
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if(b[i][j]){
                    System.out.print(i + "行" + j + "列" + "*");
                }else{
                    System.out.print(i + "行" + j + "列" + "");

                }
            }
            System.out.println();
        }
    }
}
