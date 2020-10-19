package com.lx.stu.week3;

import com.sun.tracing.dtrace.ArgsAttributes;

import java.lang.reflect.Method;

/**
 * @ClassName OverLoadTextApp
 * @Description 复数相加
 * @Author faine
 * @Date 2020/10/19
 */
public class OverLoadTextApp {
    public static void main(String[] args){
        {
            long startTime = System.currentTimeMillis();
            //实例化两个对象，调用有参数的构造函数
            OverLoadText c0 = new OverLoadText(1, 2);
            OverLoadText c1 = new OverLoadText(3, 4);
            //调用函数
            c0.overLoadTextApp(c1);
            System.out.println(c1.realPart + "+" + c1.imaginPart + "i");
            long endTime = System.currentTimeMillis(); //获取结束时间

            System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
        }

    }
}