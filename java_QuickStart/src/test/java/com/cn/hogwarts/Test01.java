package com.cn.hogwarts;

public class Test01 {
    public static void main(String[] args){
        //要执行customerServiceImpl中的logout方法

        //以下程序面向接口去调用
        CustomerService cs = new CustomServiceImpl(); //多态

        //调用
        cs.logout();
    }
}
