package com.lx.stu.week4;

/**
 * @ ClassName BaseEmployee
 * @ Description 基础的员工抽象类
 * @ Author faine
 * @ Date 2020/10/26
 **/
public abstract class BaseEmployee {
    public void print(){
        System.out.println("This is an abstract class.");
    }

    /**
     * 发工资
     *
     * 根据员工ID获取具体薪水
     *
     * @ return int 薪水
     */
    public abstract int getSalary();
}
