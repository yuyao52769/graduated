package com.ThreadStudy.LocalThraedLearn;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.bcel.internal.generic.VariableLengthInstruction;

import java.util.concurrent.atomic.LongAdder;

public class DemoOne {

    ThreadLocal<String> local = new ThreadLocal<>();
    LongAdder adder = new LongAdder();

    public static void main(String[] args) {


    }
}
