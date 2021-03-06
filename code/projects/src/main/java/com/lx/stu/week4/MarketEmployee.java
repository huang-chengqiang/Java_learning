package com.lx.stu.week4;

import com.sun.xml.internal.ws.api.ha.HaInfo;
import java.security.acl.LastOwnerException;

/**
 * @ ClassName MarketEmployee
 * @ Description TODO
 * @ Author faine
 * @ Date 2020/10/26
 */
public class MarketEmployee extends BaseEmployee {
    private String id;
    private static final String ADMIN = "admin";
    private static final int HIGH_SALARY = 3000;
    private static final int LOWER_SALARY = 1000;

    public MarketEmployee(String id) {
        this.id = id;
    }

    public MarketEmployee() {
    }

    @Override
    public void print() {
        super.print();
        System.out.println("This is a MarketEmployee class");
    }

    @Override
    public int getSalary(){
        if (ADMIN.equals(this.id)){
            return HIGH_SALARY;
        }else {
            return LOWER_SALARY;
        }
    }
}

