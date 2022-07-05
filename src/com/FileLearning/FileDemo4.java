package com.FileLearning;


import java.io.File;
import java.io.FileFilter;

// 过滤器 FileFilter 和 FileNameFilter
public class FileDemo4 extends FileDemo1 {

    public static File file = new File(baseUrl);

    public static void find(File file){
        File[] listFiles = file.listFiles( (fileName) -> {
            return fileName.getName().endsWith(".txt") || fileName.isDirectory();
        });

        for (File listFile : listFiles) {
            if (listFile.isDirectory()) {
                find(listFile);
            } else {
                System.out.println(listFile.getName());
            }
        }
    }

    public static void main(String[] args) {
        FileDemo4.find(file);
    }

}
