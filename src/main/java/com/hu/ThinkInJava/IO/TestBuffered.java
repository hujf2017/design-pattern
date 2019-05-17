package com.hu.ThinkInJava.IO;

import org.junit.Test;

import java.io.*;

/**
 * @Auther: xupc
 * @Date: 2019/5/6 11:48
 * @Description:
 */
public class TestBuffered {
    //使用BufferInputStream
    @Test
    public void testBufferinputOutput(){
        //文件对象
        File filein = new File("hello1.txt");
        File fileout= new File("hello3.txt");
        //创建节点流：FileInputStream,FileOutputStream
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream =null;
        try {
            FileInputStream fileInputStream = new FileInputStream(filein);
            FileOutputStream fileOutputStream = new FileOutputStream(fileout);
            //3.将创建的节点流的对象作为形参传递给缓冲流的构造器中
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            //4.具体实现文件复制的操作
            byte[] bytes = new byte[24];
            int len;
            while((len=bufferedInputStream.read(bytes))!=-1){
                bufferedOutputStream.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedOutputStream.close();
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
