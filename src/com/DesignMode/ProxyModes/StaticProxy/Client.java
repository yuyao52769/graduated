package com.DesignMode.ProxyModes.StaticProxy;

public class Client {


    public static void main(String[] args) {
        TeacherImpl teacher = new TeacherImpl();
        TeacherProxy proxy = new TeacherProxy(teacher);
        proxy.teach();

    }
}
