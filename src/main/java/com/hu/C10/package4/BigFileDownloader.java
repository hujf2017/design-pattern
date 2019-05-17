//package com.hu.C10.package4;
//
//import com.hu.C10.util.Debug;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
///**
// * @Auther: xupc
// * @Date: 2019/5/15 13:09
// * @Description:
// *
// * 1.将文件划分为几块
// *
// *
// */
//public class BigFileDownloader {
//    protected final URL requestURL;
// //   protected final long fileSize;
//    /*
//     * @Author xupc
//     * @Date 2019/5/15 13:11
//     * @return  下载数据的存储
//     **/
//
//    //protected final Storage storage;
//    //protected final
//
//    public BigFileDownloader(String stringURL, long fileSize) throws MalformedURLException {
//        requestURL = new URL(stringURL);
//       // fileSize = retieveFileSize(requestURL);
//        Debug.info("file total size:s%",fileSize);
//        String fileName = stringURL.substring(stringURL.lastIndexOf('/')+1);
//    }
//
//    /*
//     * @Author xupc
//     * @Date 2019/5/15 13:24
//     * @return
//     **/
//    public void download(int taskCount,long reportInterval){
//        long chunkSizePerThread = fileSize / taskCount;
//        //下载数据段的起始位置
//        long lowerBound = 0;
//        //下载数据段的结束位置
//        long upperBound = 0;
//       // DownLoadTask dt;
//        for(int i=taskCount-1;i>=0;i--){
//            lowerBound = i*chunkSizePerThread;
//            if(i==taskCount-1){
//                upperBound = fileSize;
//            }else{
//                upperBound = lowerBound+chunkSizePerThread-1;
//            }
//            //创建下载任务
//            //dt = new Dow
//
//        }
//    }
//}
