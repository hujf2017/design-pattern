package com.hu.ThinkInJava.IO;

import org.junit.Test;

import java.io.*;

/**
 * @Auther: xupc
 * @Date: 2019/5/5 22:50
 * @Description:
 */
public class testIoStream {
    //实现文件复制
    public static void copyFile(String src,String target){
        File filein = new File(src);
        File fileout= new File(target);
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(filein);
            fileOutputStream = new FileOutputStream(fileout);
            byte b[] = new byte[20];
            int len;
            while((len = fileInputStream.read(b))!=-1){
                fileOutputStream.write(b,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void testFileInandOut(){
        File filein = new File("hello.txt");
        File fileout= new File("hello2.txt");
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(filein);
            fileOutputStream = new FileOutputStream(fileout);
            byte b[] = new byte[20];
            int len;
            while((len = fileInputStream.read(b))!=-1){
                 fileOutputStream.write(b,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }


    @Test
    public void testInStream1() throws IOException {
        File file  = new File("hello.txt");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            int len;
            while((len=fileInputStream.read())!=-1){
                System.out.print((char)len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fileInputStream.close();
        }

        fileInputStream.close();
    }

    @Test
    public void testInStream2() {
        File file  = new File("hello.txt");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            byte b[] = new byte[5];
            int len;
            while((len = fileInputStream.read(b))!=-1){
                for(int i=0;i<len;i++){
                    System.out.print((char)b[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileInputStream!=null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Test
    public void testOutStream(){
        //file对象
        File file  = new File("hello1.txt");
        FileOutputStream fileOutputStream =null;
        try {
             fileOutputStream = new FileOutputStream(file,true);
            //read write都是字节
            String str = "my name is Air!!!" ;
            fileOutputStream.write(str.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fileOutputStream!=null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
