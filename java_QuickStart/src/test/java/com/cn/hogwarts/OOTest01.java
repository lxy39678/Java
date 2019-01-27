package com.cn.hogwarts;

public class OOTest01 {
    public static void main(String[] args){
        //1.创建对象
        //stu1是一个局部变量，这个局部变量stu1是student类型，也就是引用类型
        //stu1该局部变量称作引用，引用中保存了对象在堆中的内存地址
        //通过"引用"去间接访问
        Student stu1 = new Student();
        //一个类型可以创建多个对象
        Student stu2 = new Student();
        int i=10;
        //2.使用对象
        //访问成员变量，必须使用"引用."
        //name是成员变量，对象相关，必须先有对象才能访问
        //System.out.println(Student.name);
        //赋值
        stu1.id=1000;
        stu1.name="张三";
        stu1.age=15;
        stu1.sex=true;
        stu1.addr="上海";
        System.out.println("id:"+stu1.id);
        System.out.println("name:"+stu1.name);
        System.out.println("age:"+stu1.age);
        System.out.println("sex:"+stu1.sex);
        System.out.println("addr:"+stu1.addr);
    }

    /**
     * 关于系统默认值类型：
     *    基本数据类型：
     *    byte,short,int,long 0
     *    float,double 0.0
     *    boolean false
     *    char \u0000
     *    引用数据类型:null
     */
}
