package com.FileLearning;

import java.io.File;

public class FileDemo2 extends FileDemo1 {

    public static void main(String[] args) {
        File file = new File(baseUrl + "hello");
        file.delete();
        file.mkdir();

    }
}
