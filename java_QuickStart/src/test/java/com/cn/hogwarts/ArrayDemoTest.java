package com.cn.hogwarts;

import org.junit.Test;

import java.util.Arrays;

public class ArrayDemoTest {

    /**
     * 第一种数组创建方式
     */
    @Test
    public void fun(){
        int[] intArr = new int[5];
        //nt[] intArr1 = null;  //空指针异常
        //System.out.println(intArr1[0]);
        System.out.println(intArr[0]);
        System.out.println(intArr[1]);
        System.out.println(intArr[2]);
        System.out.println(intArr[3]);
        System.out.println(intArr[4]);

        for(int i=0;i<intArr.length;i++){
            System.out.println(intArr[i]);
        }
    }

    /**
     * 第二种数组创建方式
     */
    @Test
    public void fun1(){
        int[] intArr = new int[]{1,2,3,4,5};
        for(int i=0;i<intArr.length;i++){
            System.out.println(intArr[i]);
        }
    }

    /**
     * 第三种数组创建方式
     */
    @Test
    public void fun2(){
        int[] intArr = {1,2,3,4,5};
        for(int i=0;i<intArr.length;i++){
            System.out.println(intArr[i]);
        }
    }

    @Test
    public void fun3(){
        //int[] intArr = {1,3,5,'a',"marry",4.5}; //数组只能存储同一类型的元素
        int[] intArr = {1,3,5,'a'}; //char类型ASCII表自动转义
        for(int i=0;i<intArr.length;i++){
            System.out.println(intArr[i]);
        }

        //数组排序和转字符串
        int[] intArr1 = {9,6,7,4,1,3,5};
        Arrays.sort(intArr1);
        for(int i=0;i<intArr1.length;i++){
            System.out.println(intArr1[i]);
        }
        System.out.println(Arrays.toString(intArr1));
    }
}
