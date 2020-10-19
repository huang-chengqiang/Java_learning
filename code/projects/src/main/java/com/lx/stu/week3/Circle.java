package com.lx.stu.week3;

import java.text.DecimalFormat;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author faine
 * @Date 2020/10/19
 */
public class Circle extends Point {
    /**
     * 定义圆的半径
     */
    private Integer r;

    /**
     *构造无参构造函数
     */
    public Circle(){
    }

    /**
     *构造有参构造函数
     * @param x 圆点的横坐标
     * @param y 圆点的纵坐标
     */
    public Circle(int x , int y){
    }

    /**
     *求圆的面积
     * @param x 圆点的横坐标
     * @param y 圆点的纵坐标
     * @param r 圆的半径
     */
    public void CircleArea(int x, int y, int r){
        java.text.DecimalFormat df = new DecimalFormat("#.00");
        System.out.println ("圆的面积是：" + df.format(Math.PI * r * r) + "\n");
    }
    public void whetherInCircle(Point point , Point circlePoint , int r)
    {
        double distance = pointDistance(point,circlePoint);
        if (distance < r)
        {
            System.out.println("点在圆内");
        }
        else if (distance == r)
        {
            System.out.println("点在圆上");
        }
        else {
            System.out.println("点在圆外");
        }

    }

}
