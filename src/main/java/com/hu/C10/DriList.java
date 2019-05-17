package com.hu.C10;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @Auther: xupc
 * @Date: 2019/4/26 22:14
 * @Description:
 */
public class DriList {
    public static void main(String []args){
        File path = new File(".");
        String [] list;
        if(args.length==0){
            list = path.list();
        }else{
            list = path.list(new DirFilter(args[0]));
        }

    }

    static class DirFilter implements FilenameFilter {

        private  String arg;

        public DirFilter(String arg) {
            this.arg = arg;
        }

        public boolean accept(File dir, String name) {
            // Strip path information:
            String f = new File(name).getName();
            return f.indexOf(arg) != -1;
        }
    }
}
