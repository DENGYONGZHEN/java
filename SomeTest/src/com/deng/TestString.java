package com.deng;

/**
 * @Classname TestString
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/12 23:33
 * @Created by helloDeng
 */
public class TestString {
    public static void main(String[] args) {
        String a = "a";  //常量池中的对象
        String b = "b";  //常量池中的对象
        String c = a + b;  //c是在堆上创建的新的对象
        String d = new String("ab");

        System.out.println((a + b).equals(c));   //true   always true
        System.out.println(a + b == c);
        System.out.println(c == d);
        System.out.println(c.equals(d));        //true

/**
 *String str2 = new String("aaa") ;
 * 一共会创建两个字符串对象一个在堆中，一个在常量池中（前提是常量池中还没有 "aaa" 象）
 *
 * 常量与常量的拼接，结果是常量，返回常量池中的地址；
 * 只要有一个变量，在不适用intern时，都看做变量，使用new创建对象，返回堆区地址；
 * 如果对拼接结果使用intern，则会返回常量池中的地址；
 * 如果使用final修饰，final字符串就是常量，常量与常量拼接，返回常量池中的地址；
 */
        String s1 = "JavaEE";
        String s2 = "Hadoop";
        // 字面量定义，保存在常量池
        String s3 = "JavaEEHadoop";
        // 常量与常量的拼接
        String s4 = "JavaEE" + "Hadoop";
        // 对象参与拼接
        String s5 = s1 + "Hadoop";
        String s6 = "JavaEE" + s2;
        // 拼接结果调用intern方法
        String s7 = (s1 + s2).intern();

        // true
        System.out.println(s3 == s4);
        // false
        System.out.println(s3 == s5);
        // false
        System.out.println(s3 == s6);
        // false
        System.out.println(s5 == s6);
        // true
        System.out.println(s7 == s3);

        // final修饰，变成常量
        final String s8 = "JavaEE";
        String s9 = s8 + "Hadoop";
        // true
        System.out.println(s9 == s3);


    }
}
