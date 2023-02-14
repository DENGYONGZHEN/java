package com.deng;

import java.util.Scanner;

/**
 * @Classname TestCompareDouble
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/14 19:02
 * @Created by helloDeng
 */
public class TestCompareDouble {
    public static void main(String[] args) {
   /*     Scanner scanner = new Scanner(System.in);
        double aDouble = scanner.nextDouble();
        if(aDouble >= 0 && aDouble <= 1){
            System.out.println(true);
        }else {
            System.out.println(false);
        }*/
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++)
        {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
        System.out.println('b' + 'c');

    }
}
