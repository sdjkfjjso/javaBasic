package com.neuedu.school;

public class Square extends Photo {
    public void girth(){
        System.out.println("周长是:"+this.getRadius()*4);
    }
    public void area(){
        System.out.println("面积是"+this.getRadius()*this.getRadius());
    }
}