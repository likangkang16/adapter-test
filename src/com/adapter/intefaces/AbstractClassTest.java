package com.adapter.intefaces;

/**
 * @ClassName AbstractClassTest
 * @Description //TODO
 * @Author lkk
 * Date 2022/06/06/19:19
 * @Version 1.0
 **/
public class AbstractClassTest {
    public static void main(String[] args) {
        AbstractClass abstractClass =new AbstractClassA();
        abstractClass.show1();
        abstractClass.show2();
        AbstractClass abstractClass1 =new AbstractClassB();
        abstractClass1.show1();
        abstractClass1.show2();
    }
}
