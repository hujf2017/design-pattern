package com.hu.C10.package4;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @Auther: xupc
 * @Date: 2019/5/15 14:18
 * @Description:
 */
public class Storage implements Closeable,AutoCloseable {
    protected final AtomicLong totalWrites = new AtomicLong(0);
    private final RandomAccessFile storeFile;
    private final FileChannel storeChannel;


    public Storage(long fileSize, String fileShortName) throws FileNotFoundException {
        String fullFileName = System.getProperty("java.io.tmpdir")+"/"+fileShortName;
        String localFileName;
        localFileName = createStoreFile(fileSize, fullFileName);
        storeFile = new RandomAccessFile(localFileName, "rw");
        storeChannel = storeFile.getChannel();
    }

    private String createStoreFile( final  long fileSize, String fullFileName) throws FileNotFoundException {
        File file  = new File(fullFileName);
        RandomAccessFile raf;
        raf = new RandomAccessFile(file, "rw");
        return fullFileName;
    }

    @Override
    public void close() throws IOException {

    }
}
