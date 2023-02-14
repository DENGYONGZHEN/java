package com.deng;

/**
 * @Classname TestLogarithmic
 * @Description 对数
 * @Version 1.0.0
 * @Date 2023/2/14 22:18
 * @Created by helloDeng
 *
 *  编写一个静态方法 lg()，接受一个整型参数 N，返回不大于 log2N 的最大整数。不要使用 Math 库。
 */
public class TestLogarithmic {
    public static void main(String[] args) {
        TestLogarithmic logarithmic = new TestLogarithmic();
        System.out.println(logarithmic.lg(15));
        System.out.println(logarithmic.lg(120));
        System.out.println(logarithmic.lg(254));
    }

    public int lg(int N){
        int i = 0;
        for (int j = N; ; j/=2) {
            if(j == 1){
                break;
            }
            i++;
        }
        return i;
    }
}
