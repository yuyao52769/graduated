package com.DesignMode.ProxyModes.CglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {


    //维护一个目标被代理对象
    public TeacherDao target = new TeacherDao();

    public ProxyFactory(TeacherDao target) {
        this.target = target;
    }

    // 返回一个代理对象，是target的代理对象
    public Object getProxyInstance(){
        //1. 设置工具类
        Enhancer enhancer = new Enhancer();
        //2. 设置父类
        enhancer.setSuperclass(target.getClass());
        //3. 设置回调函数
        enhancer.setCallback(this);
        //4. 创建子类对象，即代理对象
        return enhancer.create();
    }


    // 重写方法，会调用目标对象的方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理模式开启了.....");
        Object invoke = method.invoke(target, objects);
        System.out.println("cglib代理模式即将结束....");
        return invoke;
    }
}
