package com.DesignMode.ProxyModes.CglibProxy;

public class Client {

    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();
        TeacherDao instance = (TeacherDao) new ProxyFactory(target).getProxyInstance();
        instance.teacher();
    }
}
