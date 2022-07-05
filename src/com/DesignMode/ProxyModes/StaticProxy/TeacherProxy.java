package com.DesignMode.ProxyModes.StaticProxy;


// 代理对象
public class TeacherProxy implements ITeacher {

    private ITeacher target;  // 目标对象，采用接口来聚合


    // 构造器
    public TeacherProxy(ITeacher target){
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理了。。。。。");
        target.teach();
        System.out.println("进行代理增强.......");
    }
}
