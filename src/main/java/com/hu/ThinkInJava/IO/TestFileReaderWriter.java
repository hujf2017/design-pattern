package com.hu.ThinkInJava.IO;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Auther: xupc
 * @Date: 2019/5/6 10:25
 * @Description:
 */
public class TestFileReaderWriter {
    @Test
    public void testReader(){
        File file = new File("hello.txt");
        FileReader fr =null;
        try {
             fr = new FileReader(file);
            char[] c  = new char[24];
            int len;
            while ((len=fr.read(c))!=-1){
                String str = new String(c,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testWriter(){
        File file = new File("hello4.txt");
        FileWriter fw=null;
        try {
             fw = new FileWriter(file);
             String a="asdsafsdasfgsd";
             fw.write(a);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
