package com.FileLearning;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.io.File;

public class FileDemo3 extends FileDemo1 {

    public static File fileN = new File(baseUrl);

    // public String[] list() 获取该目录下所有子文件或者目录，返回值为String[]
    // public File[] listFiles() 获取该目录下所有子文件或者目录，返回值为File[]
    // 过滤器接口 FileFilter 和 FileNameFilter

    public static void forAll() {
        File file = new File(baseUrl);
        String[] stringNames = file.list();
        File[] fileNames = file.listFiles();
        for (String name : stringNames) {
            System.out.println(name);
        }

        for (File name : fileNames) {
            System.out.println(name);
        }

    }

    public void findAllTwo(File file){
        File[] listFiles = file.listFiles();
        for (File listFile : listFiles) {
            if (listFile.isDirectory()) {
                findAllTwo(listFile);
            } else {
                System.out.println(listFile.getName());
            }

        }
    }

    public static void findFile(File file) {
        File[] listFiles = file.listFiles();
        for (File listFile : listFiles) {
            if (listFile.getName().endsWith(".java")) {
                System.out.println(listFile.getName());
            } else if (listFile.isDirectory()) {
                findFile(listFile);
            }
        }
    }

    public static void findFileTwo(File file) {
        File[] listFiles = file.listFiles((fileName)->{
            return fileName.getName().endsWith(".java") || fileName.isDirectory();
        } );
        for (File listFile : listFiles) {
            if (listFile.isDirectory()) {
                findFileTwo(listFile);
            }
            else {
                System.out.println(listFile.getName());
            }
        }
    }

    public static void main(String[] args) {
        //FileDemo3.forAll();
//        new FileDemo3().findAllTwo(fileN);
        FileDemo3.findFileTwo(fileN);
    }
}
