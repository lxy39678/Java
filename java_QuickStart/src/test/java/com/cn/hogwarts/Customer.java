package com.cn.hogwarts;

//定义一个顾客类型

/**
 * 面向对象的封装性是指：
 * 1.属性私有化
 * 2.对外提供setter and getter
 * 3.set方法和get方法的方法名应该遵循规范，java规范中set方法是小写set,属性第一个字母大写。
 */
public class Customer {
    //属性
    //成员变量
    private int age;  //private修饰的数据只能在本类中访问

    //对外提供两个公开的方法
    //set

    public void setAge(int _age){
        if(_age<0 || _age>100){
            System.out.println("年龄不合法");
            return;
        }
        age = _age;
    }

    //get
    public int getAge(){  //成员方法
                          //成员方法必须使用"引用."的方法访问
        return age;
    }
}
