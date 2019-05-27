package com.neuedu.test;

public class ChangFangXing {
//    //定义长宽属性
//     int Width;
//     int Height;
//    //无参——宽、高默认值为1
//    public ChangFangXing(){
//        this.Height = 1;
//        this.Width = 1;
//    }
//    //1个参数——宽、高均为参数值
//    public ChangFangXing(int a){
//        this.Width = a;
//        this.Height = a;
//    }
//    //2个参数——宽、高各为参数值
//    public ChangFangXing(int Width, int Height){
//        this.Height = Height;
//        this.Width = Width;
//    }
//    //求周长
//    public int Length(){
//        return 2*(this.Height+this.Width);
//    }
//    //求面积
//    public int Square(){
//        return this.Height*this.Width;
//    }
    int width;
    int height;
    //  定义无参
    public void girth(){
        int g= width*2+height*2;
        System.out.println("长方形的周长："+g);
    }
    public  void area(){
        int area=width*height;
        System.out.println("长方形的面积："+area);
    }
    //  定义一个参数
    public  void girth1(int a){
        width=a;
        height=a;
        int g= width*2+height*2;
        System.out.println("长方形的周长："+g);
    }
    public  void area1(int a){
        width=a;
        height=a;
        int area=width*height;
        System.out.println("长方形的面积："+area);
    }
    //  定义两个参数
    public  void girth2(int width,int height){
        int g= width*2+height*2;
        System.out.println("长方形的周长："+g);
    }
    public  void area2(int width,int height){
        int area=width*height;
        System.out.println("长方形的面积："+area);
    }
}

