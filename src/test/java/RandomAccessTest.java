import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Auther: xupc
 * @Date: 2019/5/15 14:58
 * @Description:
 */

public class RandomAccessTest {

    @Test
    public void  RandomAccesstt () throws IOException {
        File directory = new File("a.txt");//设定为当前文件夹
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
        FileInputStream fileInputStream = new FileInputStream(directory);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        FileChannel inChannel = fileInputStream.getChannel();
        ByteBuffer buf = ByteBuffer.allocate(48);
        int len=inChannel.read(buf);
        buf.flip();
        while(len!=-1){
            while(buf.hasRemaining()) {
                System.out.println((char) buf.get());
            }
            buf.clear();

        }

        System.out.println(directory.getCanonicalPath());//获取标准的路径
            System.out.println(directory.getAbsolutePath());//获取绝对路径

//        String localFileName=System.getProperty("a.txt");
//        RandomAccessFile storeFile = new RandomAccessFile(localFileName, "rw");


    }
}
