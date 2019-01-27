package com.cn.hogwarts;

public class OOTest02 {
    public static void main(String[] args){
        //1.创建Customer类型对象
        Customer c = new Customer();

        //2.读取(get)
        //System.out.println(c.age); //0

        //3.赋值(set)
        //c.age = 10;
        //c.age = -10; //因为age属性没有任何限制，导致外部程序可以随意访问age,导致age不安全
                     //不合法的数据

        //4.读取
        //System.out.println(c.age); //10

        //赋值
        c.setAge(-10);

        //读取
        int age = c.getAge();
        System.out.println(age);

        System.out.println(c.getAge()); //10
    }
}
