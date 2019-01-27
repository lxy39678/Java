package com.cn.hogwarts;
import org.junit.Test;

import java.util.*;

public class MapDemoTest {

    /**
     * map的第一种遍历方式
     */
    @Test
    public void fun(){
        HashMap<String,Object> hashMap = new HashMap<String,Object>();
        hashMap.put("name","tom");
        hashMap.put("age",28);
        hashMap.put("gender",'男');

        Iterator<Map.Entry<String,Object>> iterator = hashMap.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String,Object> next = iterator.next();
            System.out.println("key is:"+next.getKey());
            System.out.println("value is:"+next.getValue());
        }
    }

    /**
     * map的第二种遍历方式
     */
    @Test
    public void fun1(){
        HashMap<String,Object> hashMap = new HashMap<String,Object>();
        hashMap.put("name","tom");
        hashMap.put("age",28);
        hashMap.put("gender",'男');

        //Set<Map.Entry<String,Object>> entries = hashMap.entrySet();

        for(Map.Entry en:hashMap.entrySet()){
            System.out.println("key is:"+en.getKey());
            System.out.println("value is:"+en.getValue());
        }
    }

    /**
     * map第第三种遍历方式
     */
    @Test
    public void fun2(){
        HashMap<String,Object> hashMap = new HashMap<String,Object>();
        hashMap.put("name","tom");
        hashMap.put("age",28);
        hashMap.put("gender",'男');

        Set<String> strings = hashMap.keySet();

        for(String key:strings){
            System.out.println("key is:"+key);
            System.out.println("value is:"+hashMap.get(key));
        }
    }

    /**
     * map有序存储
     */
    @Test
    public void fun3(){
        LinkedHashMap<String,Object> linkedHashMap =new LinkedHashMap<String, Object>();
        linkedHashMap.put("name","tom");
        linkedHashMap.put("age",28);
        linkedHashMap.put("gender",'男');

        for(Map.Entry en:linkedHashMap.entrySet()){
            System.out.println(en.getKey());
            System.out.println(en.getValue());
        }
    }

}
