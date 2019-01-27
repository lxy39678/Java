package com.cn.hogwarts;
import org.junit.Test;

import java.util.*;


public class ListDemoTest {

    @Test
    //ArrayList查询速度快，增删慢
    public void fun(){
        ArrayList arrayList = new ArrayList();
        arrayList.add("name");
        arrayList.add("age");
        arrayList.add(12);
        arrayList.add('a');
        arrayList.add("number");

        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }

    //限制只能传string
    @Test
    public void fun1(){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("name");
        arrayList.add("age");
        //arrayList.add(12);
        //arrayList.add('a');
        //arrayList.add(5.6);

        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }

    @Test
    //LinkedList增删速度快，查询慢
    public void fun2(){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("name");
        linkedList.add("age");

        for(int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }
    }

    //速度对比-LinkedList
    @Test
    public void fun3(){
        long start = System.currentTimeMillis();
        System.out.println(start);
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for(int i=0;i<100000;i++){
            linkedList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println(end-start);
    }

    //速度对比-ArrayList
    @Test
    public void fun4(){
        long start = System.currentTimeMillis();
        System.out.println(start);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i=0;i<100000;i++){
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println(end-start);
    }

    //数组允许存储重复的值
    @Test
    public void fun5(){
        ArrayList<String> stringArray = new ArrayList<String>();
        stringArray.add("name");
        stringArray.add("name");
        stringArray.add("name");
        stringArray.add("name");
        stringArray.add("name");

        for(int i=0;i<stringArray.size();i++){
            System.out.println(stringArray.get(i));
        }
    }

    //set需要用迭代器去遍历-会去掉重复的值（为数组去重）
    @Test
    public void fun6(){
        HashSet hashSet = new HashSet();
        hashSet.add("name");
        hashSet.add("name");
        hashSet.add("name");
        hashSet.add("name");
        hashSet.add("name");

        Iterator iterator = hashSet.iterator(); //定义迭代器

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void fun7(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(55);
        list.add(11);
        list.add(3);
        list.add(6);
        list.add(1);

        System.out.println("排序前");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        Collections.sort(list);
        System.out.println("正序后");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        Collections.reverse(list);
        System.out.println("倒序后");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

}
