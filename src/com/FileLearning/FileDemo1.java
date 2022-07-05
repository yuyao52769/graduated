package com.FileLearning;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.File;
import java.io.IOException;
import java.time.temporal.ChronoUnit;

public class FileDemo1 {

    public static String baseUrl = "D:\\JavaProjects\\TestFiles\\";

    public static String currentPath = "C:\\Users\\yao\\IdeaProjects\\Graduated\\TestFiles\\";

    public static void main(String[] args) throws IOException {
//        System.out.println(File.pathSeparator);
//        System.out.println(File.pathSeparatorChar);
//        System.out.println(File.separator);
//        System.out.println(File.separatorChar);
        File file = new File(currentPath + "a.txt");
//        File fileOne = new File(baseUrl + "a.txt");
        System.out.println(file.createNewFile());
        System.out.println(file);
        System.out.println("getName: "+ file.getName());
        System.out.println("getPath: " + file.getPath());
        System.out.println("getAbsolutePath: "+ file.getAbsolutePath());
        System.out.println("getLength: "+ file.length());
    }
}
