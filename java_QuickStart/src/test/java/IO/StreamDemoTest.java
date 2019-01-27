package IO;

import com.cn.hogwarts.A;
import org.junit.Test;

import java.io.*;

public class StreamDemoTest {

    //字节流-FileInputStream-读
    @Test
    public void fun() throws Exception{
        FileInputStream fis = new FileInputStream("/Users/lixiangyu/IdeaProjects/java_QuickStart/src/test/java/IO/a.txt");
        int num = 0;
        while((num=fis.read())!=-1){
            System.out.println((char) num);
        }
    }

    //字节流-FileOutputStream-写
    @Test
    public void fun1() throws Exception{
        FileOutputStream fis = new FileOutputStream("/Users/lixiangyu/IdeaProjects/java_QuickStart/src/test/java/IO/d.txt",true);
        fis.write("fileoutputstream".getBytes());
        fis.close();
    }

    //字节流-BufferedInputStream-读
    @Test
    public void fun2() throws Exception{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("/Users/lixiangyu/IdeaProjects/java_QuickStart/src/test/java/IO/a.txt")));
        byte[] bt = new byte[1024*10];
        int num = 0;
        while((num=bis.read(bt))!=-1){
            System.out.println(new String(bt,0,num));
        }
    }

    //字节流-BufferedOutputStream-写
    @Test
    public void fun3() throws Exception{
        BufferedOutputStream bos = new BufferedOutputStream((new FileOutputStream("/Users/lixiangyu/IdeaProjects/java_QuickStart/src/test/java/IO/e.txt",true)));
        bos.write("aaaaaa".getBytes());
        bos.flush();
        bos.close();
    }
}
