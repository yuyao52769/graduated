package com.yuyao.reflect;

import com.sun.media.sound.RIFFInvalidDataException;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {

    public static void main(String[] args) throws IOException {
        // 加载配置文件
        Properties pro = new Properties();
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream input = classLoader.getResourceAsStream("pro.properties");
        System.out.println(input);

        // 开始反射
        try {
          pro.load(input);
          String className = pro.getProperty("className");
          String methodName = pro.getProperty("methodName");
          Class studentClass = Class.forName(className);
          Object obj = studentClass.newInstance();
          Method method = studentClass.getMethod(methodName);
          method.invoke(obj);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Excellent! how good are you?");
        }

    }
}
