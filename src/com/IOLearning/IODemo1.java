package com.IOLearning;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo1 {

    // 字节输出流
    // OutputStream 抽象类
    // 一般使用的子类为FileOutputStream
    // 构造方法
    // FileOutputStream(File file) File表示这个文件被写入数据的输出流

    public static String baseUrl = "D:\\JavaProjects\\TestFiles\\";

    public static String currentPath = "C:\\Users\\yao\\IdeaProjects\\Graduated\\TestFiles\\";

    public static File file = new File(baseUrl + "k.txt");

    public static void test_1() throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream(file);
        String s1 = "Hello World";
        byte[] bytes = s1.getBytes();
        try {
            fos.write(99);
            fos.write(bytes);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 追加写、续写
    // FileOutputStream(File file, boolean append) append表示是否续写
    // true：不会覆盖，直接末尾追写
    // false: 创建新文件，覆盖原文件
    // 换行：windows：\r\n
    //      linux  : /n
    //      mac    : /r
    public static void test_2(){
        try {
            FileOutputStream fos = new FileOutputStream(file, true);
            fos.write("\r\n".getBytes());
            fos.write("jkdhjkafgilq".getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        try {
            IODemo1.test_2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
