package com.hu.ThinkInJava.IO;

import java.io.*;

/**
 * @Auther: xupc
 * @Date: 2019/5/5 20:58
 * @Description:
 */
public class IoStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {

            try {
                //1.Buffered input file
                FileInputStream fileInputStream = new FileInputStream(args[0]);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                DataInputStream in = new DataInputStream(bufferedInputStream);
                String s ,s2 = new String();
                while (!((s=in.readLine())!=null)){
                    s2 += s+"\n";
                }
                in.close();

                //2.Input from memory
                StringBufferInputStream in2 = new StringBufferInputStream(s2);
                int c;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
