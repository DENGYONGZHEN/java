package com.deng;

/**
 * @Classname TestFinallyAndReturn
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/26 22:47
 * @Created by helloDeng
 *
 *
 *
 * 如果finally前面的代码中有return，那么先执行finally中的语句然后再执行return。
 * 如果finally中的代码也有return，则finally中return的结果会覆盖前面代码中的return结果。
 */
public class TestFinallyAndReturn {


    public static String sRet = "";

    public static void func(int i) {
        try {
            if (i % 2 == 0) {
                throw new Exception();
            }
        } catch (Exception e) {
            sRet += "0";
            return;
        } finally {
            sRet += "1";
        }
        sRet += "2";
    }

    public static void main(String[] args) {
        func(1);
        func(2);
        System.out.println(sRet);
    }

}
