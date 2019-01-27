package com.cn.hogwarts;

import org.junit.Test;

public class ForDemoTest {

    @Test
    public void fun(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }

    @Test
    public void fun1(){
        int a=8;
        while(a<10){
            System.out.println(a);
            a++;
        }

        do{
            System.out.println(a);
            a++;
        }
        while(a<12);
    }

    @Test
    public void fun2(){
        for(int i=0;i<10;i++){
            if(i==4){
                //continue; //i=4被跳过
                //break;
                return;
            }
         System.out.println(i);
        }
    }

    @Test
    public void fun3(){
        try{
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }

    @Test
    public void fun4(){
        String [] strArr = {"tom","jerry","marry","lauren"};
        for(int i=0;i<strArr.length;i++){
            System.out.println(i);
        }
        //增强for循环
        for(String str:strArr){
            System.out.println(str);
        }

        for(int i=0;i<strArr.length;i++){
            System.out.println(strArr[i]);
        }
    }
}
