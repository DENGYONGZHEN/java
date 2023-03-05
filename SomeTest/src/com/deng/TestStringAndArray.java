package com.deng;

/**
 * @Classname TestStringAndArray
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/26 22:59
 * @Created by helloDeng
 *
 *
 *
 * Java中没有引用传递 只有值传递 或者说副本传递    运行change（）方法时，str和ch这两个实参
 * 引用的地址被复制一份副本作为change的形参传入，这时候原本和副本指向同一个地址
 * 1.str=“test OK”；因为字符串是对象 这相当于在常量池创建一个新的字符串常量 把这个常量的地址给了形参
 * 所以实参和形参指向不同地址  对形参的改变不影响实参 因为方法结束 栈帧回收  这个形参死亡；
 * 2 ch[0]='g';  明显实参和形参还是指向同一个地址  把元素  字符g赋值给地址相同的ch数组
 * 形参改变  实参也改变；
 * 有的兄弟说是String的不可变  我也没想明白到底有影响么  但是我把String改为可变的StringBuilder
 * 结果并没有变化
 */
public class TestStringAndArray {


    String str = new String("tarena");
    char[] ch = {'a', 'b', 'c'};

    public static void main(String args[]) {
        TestStringAndArray stringAndArray = new TestStringAndArray();
        stringAndArray.change(stringAndArray.str, stringAndArray.ch);
        System.out.print(stringAndArray.str + " and ");
        System.out.print(stringAndArray.ch);
    }

    public void change(String str, char ch[]) {
        //引用类型变量，传递的是地址，属于引用传递。
        str = "test ok";
        ch[0] = 'g';
    }

}
