package com.DesignMode.ProxyModes.StaticProxy;


// 被代理对象
public class TeacherImpl implements ITeacher {


    @Override
    public void teach() {
        System.out.println("老师 授课中.......");
    }
}
