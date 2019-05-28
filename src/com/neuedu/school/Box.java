package com.neuedu.school;

public class Box {
    private char color;
    private int cpu;
    //无参
    public Box(){
        color='黑';
        cpu=001;
    }
    //有参
    public Box(char color,int cpu){
        this.color=color;
        this.cpu=cpu;
    }
    @Override
    public String toString() {
        return "颜色为："+color+"  "+"cpu型号为："+cpu;
    }
}


