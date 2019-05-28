package com.neuedu.test;

import java.util.Scanner;

public class Circle {
    //    定义圆类，它有一个变量radius(半径)。从键盘输入数据，将半径传递给radius，编程计算并输出圆的周长和面积（确保输入的数据不为负数）。
//并对其进行测试
    int radius;
    public void radius(int  radius1){
        double π=3.14;
        if (radius1>0){
            radius=radius1;
        }else {
            System.out.println("将半径输出");
        }
        System.out.println("圆的周长为："+(2*π*radius));
        System.out.println("圆的面积为："+(π*radius*radius));
    }


}
