package com.DesignMode.ProxyModes.JDKProxy;

public class Client {

    public static void main(String[] args) {
        TeacherImpl target = new TeacherImpl();

        ProxyFactory proxyFactory = new ProxyFactory(target);
        ITeacher teacher = (ITeacher) proxyFactory.getProxyObject();
        teacher.teach();
        System.out.println(target.getClass());
    }
}
