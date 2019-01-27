package IO;
import org.junit.Test;

import java.io.*;

public class ReaderDemoTest {

    /**
     * fileReader
     * @throws Exception
     */
    //字符流-FileReader-读
    @Test
    public void fun() throws Exception{
        FileReader fr = new FileReader("/Users/lixiangyu/IdeaProjects/java_QuickStart/src/test/java/IO/a.txt");
        int num=0;
        while((num = fr.read())!=-1){
            System.out.println((char) num);
        }
        fr.close();
    }

    //字符流-FileReader-写
    @Test
    public void fun1(){
        FileWriter fw = null;
        try{
            fw = new FileWriter("/Users/lixiangyu/IdeaProjects/java_QuickStart/src/test/java/IO/b.txt",true);
            fw.write("aaa");
            fw.write("你好");
            fw.append("ccc");
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                fw.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    //字符流-BufferedReader-读
    @Test
    public void fun2()throws Exception{
        BufferedReader bfr = new BufferedReader(new FileReader("/Users/lixiangyu/IdeaProjects/java_QuickStart/src/test/java/IO/a.txt"));
        String data = null;
        while((data=bfr.readLine())!=null){
            System.out.println(data);
        }
    }

    //字符流-BufferedReader-写
    @Test
    public void fun3() throws Exception{
        BufferedWriter bfw = new BufferedWriter(new FileWriter("/Users/lixiangyu/IdeaProjects/java_QuickStart/src/test/java/IO/c.txt",true));
        bfw.newLine();
        bfw.write("my name is tom");
        bfw.flush();
    }
}
