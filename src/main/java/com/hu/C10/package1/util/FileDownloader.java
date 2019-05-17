package com.hu.C10.package1.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

/**
 * @Auther: xupc
 * @Date: 2019/4/28 08:32
 * @Description:
 */
public class FileDownloader implements  Runnable {
    private final String fileURL;

    public FileDownloader(String fileURL) {
        this.fileURL = fileURL;
    }

    public void run() {
        System.out.println("download from "+fileURL);
        String fileBaseName =fileURL.substring(fileURL.lastIndexOf('/')+1);
        try {
            URL url  = new URL(fileURL);
            String localFileName =System.getProperty("java.com.hu.C10.package1")+"/down-"+fileBaseName;
            downloadFile(url , new FileOutputStream(localFileName),1024);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
     * @Author xupc
     * @Date 2019/4/28 8:45
     * @return
     * @param url:资源位置
     * @param fileOutputStream：本地输出
     **/
    private void downloadFile(URL url, FileOutputStream OutputStream, int i) throws IOException {
        //建立HTTP连接
        final HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        httpConn.setRequestMethod("SET");
        ReadableByteChannel inChannel = null;
        WritableByteChannel outChannel = null;
        try {
            // 获取HTTP响应码
            int responseCode = httpConn.getResponseCode();
            // HTTP响应非正常:响应码不为2开头
            if (2 != responseCode / 100) {
                throw new IOException("Error: HTTP " + responseCode);
            }
            if (0 == httpConn.getContentLength()) {
                System.out.println("Nothing to be downloaded " + fileURL);
                return;
            }
            inChannel = Channels.newChannel(new BufferedInputStream(httpConn.getInputStream()));
            outChannel = Channels.newChannel(new BufferedOutputStream(OutputStream));
            ByteBuffer buf = ByteBuffer.allocate(i);
            while (inChannel.read(buf) != -1) {
                buf.flip();
                outChannel.write(buf);
                buf.clear();
            }
        }finally {
            httpConn.disconnect();
        }

    }
}
