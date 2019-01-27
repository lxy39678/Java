package com.cn.hogwarts;
import org.junit.Test;

public class HelloWorldTest {

    boolean b;
    char ch;
    byte bt;
    short st;
    int i;
    long l;
    float f;
    double d;

    @Test
    public void fun1(){
        System.out.println("boolean"+b);
        System.out.println("char"+ch);
        System.out.println("byte"+bt);
        System.out.println("short"+st);
        System.out.println("int"+i);
        System.out.println("long"+l);
        System.out.println("float"+f);
        System.out.println("double"+d);

    }

    @Test
    public void func2(){
        double a=10;
        int b=3;
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));
    }

    @Test
    public void func3(){
        int a=2;
        System.out.println("a++ is:"+(a++));
        System.out.println("++a is:"+(++a));
        System.out.println("a-- is:"+(a--));
        System.out.println("--a is:"+(--a));
    }

    @Test
    public void func4(){
        int a=10;
        int b=2;
        boolean c=false;
        if(a>10){
            System.out.println("a大于10");
        }
        else if(a==10){
            System.out.println("a等于10");
        }
        else if(a<10 & a>0){
            System.out.println("a小于10");
        }
        else{
            System.out.println("a是负数");
        }
        if(a>0 | b>0){
            System.out.println("条件成立1");
        }
        if(a<0 && b>0){
            System.out.println("条件成立2");
        }
        if(a>0 || b<0){
            System.out.println("条件成立4");
        }
        if(!c){
            System.out.println("条件成立5");
        }
    }
}
