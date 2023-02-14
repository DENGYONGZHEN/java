package com.deng;

import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 * @Classname TestCompareInteger
 * @Description   比较整数
 * @Date 2023/2/14 18:45
 * @Created by helloDeng
 */
public class TestCompareInteger {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            if (scanner.hasNext()){
                int anInt = scanner.nextInt();
                a[i] = anInt;
            }
        }
        Boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            if(a[0] != a[i]){
                flag = false;
            }
        }
        System.out.println(flag);
        
    }
}
