package com.cn.hogwarts;

//定义现实世界中的学生类型
//定义student是一个类，一种引用类型
//理念上的一个定义，现实世界中不存在
public class Student {
    //属性

    //学号
    int id; //成员变量，实例变量，非静态变量
            //id是对象级别的，必须先有对象才能访问，不能使用类直接访问

    //姓名
    String name; //不能这样访问Student.name

    //性别
    boolean sex;

    //年龄
    int age;

    //住址
    String addr;

}
