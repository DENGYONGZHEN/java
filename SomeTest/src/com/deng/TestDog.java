package com.deng;

/**
 * @Classname TestDog
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/12 23:28
 * @Created by helloDeng
 *
 * 这道题是编译报错，编译看等号左边，运行看等号右边，多态的特性
 * 编译时 b 是 Animal类型的对象，bark()方法是Dog类中才有的方法，父类对象不能用子类中的方法
 */
class Animal{
    public void move(){
        System.out.println("动物可以移动");
    }
}
class Dog extends Animal{
    public void move(){
        System.out.println("狗可以跑和走");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
}
public class TestDog{
    public static void main(String args[]){
        Animal a = new Animal();
        Animal b = new Dog();
        a.move();
        b.move();
        //编译报错
        //b.bark();
    }
}