package com.neuedu.test;

public class TestClass {
    public static void main(String[] args) {
//         ChangFangXing CFX1 = new ChangFangXing();
//        System.out.println("默认长方形的周长为："+CFX1.Length());
//        System.out.println("默认长方形的面积为："+CFX1.Square());
//
//        ChangFangXing CFX2 = new ChangFangXing(2);
//        System.out.println("一个参数长方形的周长为："+CFX2.Length());
//        System.out.println("一个参数长方形的面积为："+CFX2.Square());
//
//        ChangFangXing CFX3 = new ChangFangXing(2,3);
//        System.out.println("两个参数长方形的周长为："+CFX3.Length());
//        System.out.println("两个参数长方形的面积为："+CFX3.Square());
        ChangFangXing g =new ChangFangXing();
        g.width=1;
        g.height=1;
        System.out.println("无参");
        g.girth();
        g.area();

        System.out.println("有一个参数");
        g.girth1(2);
        g.area1(2);

        System.out.println("有两个参数");
        g.girth2(2,3);
        g.area2(2,3);
    }

}
