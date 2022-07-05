package com.DesignMode.methodTime;

public class CalculateRunningRime {


    public void calculate(methodRunningTimeInter method){
        long startTime = System.currentTimeMillis();
        method.runningMethod();
        long endTime = System.currentTimeMillis();
        System.out.println("当前方法运行时长为 " + (endTime-startTime) + "ms");
    }
}
