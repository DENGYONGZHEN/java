package com.deng;

/**
 * @Classname TestConvertIntegerToBinaryString
 * @Description 整数转换成二进制的string
 * @Version 1.0.0
 * @Date 2023/2/14 19:50
 * @Created by helloDeng
 */
public class TestConvertIntegerToBinaryString {
    public static void main(String[] args) {
        String str = "";
//        int i = 15;
//        while(i != 0){
//            str = i%2 + str;
//            i /= 2;
//        }
        int N = 16;
        for (int n = N; n > 0; n /= 2)
            str = (n % 2) + str;
        System.out.println(str);
    }
}
