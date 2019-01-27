package com.cn.hogwarts;

/**
 * 变量根据出现的位置分为两种：
 * 1.局部变量：在方法体中声明的变量叫做局部变量
 * 2.成员变量：在类体中，方法之外声明的变量统称为成员变量
 */
public class VarTest {
    //成员变量
    int i=10;
    int m;

    public void m1(int m){ //m也是局部变量
        int k=10; //局部变量
    }

    public void m2(){
        System.out.println(m); //0
    }
    public static void main(String[] args){
        VarTest vt = new VarTest();
        vt.m2();
    }
}
