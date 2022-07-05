package com.DesignMode.methodTime;

public class CalculateExample implements methodRunningTimeInter {


    @Override
    public void runningMethod() {
        myMethod();
    }

    public void myMethod(){
        for (int i = 1; i < 100000; i++) {
            int j = i + 1;
        }
    }

}
